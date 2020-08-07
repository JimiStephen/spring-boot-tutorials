package com.jimi.spring.framework.dataaccess.jdbc;

import com.jimi.spring.framework.dataaccess.jdbc.domain.Actor;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CREATE TABLE `actor` (
 * `actor_id` smallint unsigned NOT NULL AUTO_INCREMENT,
 * `first_name` varchar(45) NOT NULL,
 * `last_name` varchar(45) NOT NULL,
 * `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 * PRIMARY KEY (`actor_id`),
 * KEY `idx_actor_last_name` (`last_name`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8
 *
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 9:30
 */
public class JdbcTemplateDemo {

    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate();
    private static SimpleJdbcInsert insertActor = null;

    static {
        DataSource dataSource = DataSourceBuilder.create()
                .driverClassName("com.mysql.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/sakila?useSSL=false&amp;allowPublicKeyRetrieval=true")
                .username("root")
                .password("90jimi@mysql")
                .build();
        jdbcTemplate.setDataSource(dataSource);
        insertActor = new SimpleJdbcInsert(dataSource)
                .withTableName("t_actor")
                //specifying columns for simpleJdbcInsert add();
                .usingColumns("first_name", "last_name")
                .usingGeneratedKeyColumns("actor_id");
    }

    public static void main(String[] args) {
//        getTableRow2String();
//        getTableRow2Domain();
        getTableRow2List();
//        getTableCount();
    }

    private static void getTableRow2String() {
        String lastName = jdbcTemplate.queryForObject("select last_name from actor where actor_id=?", new Object[]{1L}, String.class);
        System.out.println("actor id 1 lastName is " + lastName);
    }

    private static void getTableRow2Domain() {
        Actor actor = jdbcTemplate.queryForObject("select actor_id,first_name,last_name,last_update from actor where actor_id=?",
                new Object[]{1L}, new RowMapper<Actor>() {
                    @Override
                    public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return Actor.builder()
                                .actorId(rs.getLong("actor_id"))
                                .firstName(rs.getString("first_name"))
                                .lastName(rs.getString("last_name"))
                                .lastUpdate(rs.getDate("last_update"))
                                .build();
                    }
                });
        System.out.println("actor id 1 is " + actor);
    }

    private static void getTableRow2List() {
        List<Actor> actors = jdbcTemplate.query("select actor_id,first_name,last_name,last_update from actor limit ?,?",
                new Object[]{0, 10}, new RowMapper<Actor>() {
                    @Override
                    public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return Actor.builder()
                                .actorId(rs.getLong("actor_id"))
                                .firstName(rs.getString("first_name"))
                                .lastName(rs.getString("last_name"))
                                .lastUpdate(rs.getDate("last_update"))
                                .build();
                    }
                });
        System.out.println("actor id 1 is " + actors);
    }

    private static void getTableCount() {
        int rowCount = jdbcTemplate.queryForObject("select count(*) from actor", Integer.class);
        System.out.println("actor rowcount is " + rowCount);
    }

    //Specifying columns for a SimpleJdbcInsert
    public void addByMap(Actor actor) {
        Map<String, Object> parameters = new HashMap<String, Object>(2);
        parameters.put("first_name", actor.getFirstName());
        parameters.put("last_name", actor.getLastName());
        Number newId = insertActor.executeAndReturnKey(parameters);
        actor.setActorId(newId.longValue());
    }

    public void addByBeanPropertySqlParameterSource(Actor actor) {
        SqlParameterSource parameters = new BeanPropertySqlParameterSource(actor);
        Number newId = insertActor.executeAndReturnKey(parameters);
        actor.setActorId(newId.longValue());
    }

    public void addByMapSqlParameterSource(Actor actor) {
        SqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("first_name", actor.getFirstName())
                .addValue("last_name", actor.getLastName());
        Number newId = insertActor.executeAndReturnKey(parameters);
        actor.setActorId(newId.longValue());
    }
}
