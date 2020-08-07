package com.jimi.spring.framework.dataaccess.jdbc;

import com.jimi.spring.framework.dataaccess.jdbc.domain.Actor;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 13:44
 */
public class JdbcBatchOperationDemo {
    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate();

    static {
        jdbcTemplate.setDataSource(
                DataSourceBuilder.create()
                        .driverClassName("com.mysql.jdbc.Driver")
                        .url("jdbc:mysql://localhost:3306/sakila?useSSL=false&amp;allowPublicKeyRetrieval=true")
                        .username("root")
                        .password("90jimi@mysql")
                        .build());
    }
    public int[] batchUpdate(final List<Actor> actors) {
        int[] updateCounts = jdbcTemplate.batchUpdate("update actor set first_name = ?, " +
                        "last_name = ? where id = ?",
                new BatchPreparedStatementSetter() {
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, actors.get(i).getFirstName());
                        ps.setString(2, actors.get(i).getLastName());
                        ps.setLong(3, actors.get(i).getActorId().longValue());
                    }
                    public int getBatchSize() {
                        return actors.size();
                    }
                });
        return updateCounts;
    }

    public int[][] batchUpdate(final Collection<Actor> actors) {
        int[][] updateCounts = jdbcTemplate.batchUpdate(
                "update t_actor set first_name = ?, last_name = ? where id = ?",
                actors,
                100,
                new ParameterizedPreparedStatementSetter<Actor>() {
                    public void setValues(PreparedStatement ps, Actor argument) throws SQLException {
                        ps.setString(1, argument.getFirstName());
                        ps.setString(2, argument.getLastName());
                        ps.setLong(3, argument.getActorId().longValue());
                    }
                });
        return updateCounts;
    }
}
