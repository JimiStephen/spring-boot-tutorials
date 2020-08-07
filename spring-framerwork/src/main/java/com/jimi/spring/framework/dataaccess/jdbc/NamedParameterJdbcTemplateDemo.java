package com.jimi.spring.framework.dataaccess.jdbc;

import com.jimi.spring.framework.dataaccess.jdbc.domain.Actor;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 10:31
 */
public class NamedParameterJdbcTemplateDemo {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public int countOfActorsByFirstName(String firstName) {
        String sql = "select count(*) from actor where first_name = :first_name";
        SqlParameterSource namedParameters = new MapSqlParameterSource("first_name", firstName);
        return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
    }


    public int countOfActorsByFirstNameByMap(String firstName) {
        String sql = "select count(*) from actor where first_name = :first_name";
        Map<String, String> namedParameters = Collections.singletonMap("first_name", firstName);
        return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
    }

    public int countOfActors(Actor exampleActor) {
        // notice how the named parameters match the properties of the above 'Actor' class
        String sql = "select count(*) from actor where first_name = :firstName and last_name = :lastName";
        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(exampleActor);
        return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
    }

    public int[] batchUpdate(final List<Actor> actors) {
        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(actors.toArray());
        int[] updateCounts = namedParameterJdbcTemplate.batchUpdate(
                "update actor set first_name = :firstName, last_name = :lastName where actor_id = :id",
                batch);
        return updateCounts;
    }
}
