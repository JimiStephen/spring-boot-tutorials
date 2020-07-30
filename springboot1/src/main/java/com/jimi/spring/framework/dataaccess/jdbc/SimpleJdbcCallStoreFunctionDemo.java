package com.jimi.spring.framework.dataaccess.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 14:40
 */
public class SimpleJdbcCallStoreFunctionDemo {
    /*
        CREATE FUNCTION get_actor_name (in_id INTEGER)
        RETURNS VARCHAR(200) READS SQL DATA
        BEGIN
        DECLARE out_name VARCHAR(200);
        SELECT concat(first_name, ' ', last_name)
        INTO out_name
        FROM t_actor where id = in_id;
        RETURN out_name;
        END;*/
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall funcGetActorName;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        this.funcGetActorName = new SimpleJdbcCall(jdbcTemplate)
                .withFunctionName("get_actor_name");
    }

    public String getActorName(Long id) {
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("in_id", id);
        String name = funcGetActorName.executeFunction(String.class, in);
        return name;
    }
}
