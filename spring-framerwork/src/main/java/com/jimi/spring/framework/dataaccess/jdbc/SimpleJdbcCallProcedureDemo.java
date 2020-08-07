package com.jimi.spring.framework.dataaccess.jdbc;

import com.jimi.spring.framework.dataaccess.jdbc.domain.Actor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.Date;
import java.util.Map;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 14:19
 */
public class SimpleJdbcCallProcedureDemo {

   /* CREATE PROCEDURE read_actor (
            IN in_id INTEGER,
            OUT out_first_name VARCHAR(100),
    OUT out_last_name VARCHAR(100),
    OUT out_birth_date DATE)
    BEGIN
    SELECT first_name, last_name, birth_date
    INTO out_first_name, out_last_name, out_birth_date
    FROM t_actor where id = in_id;
    END;*/

    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall procReadActor;
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.procReadActor = new SimpleJdbcCall(dataSource)
                .withProcedureName("read_actor");
    }
    public Actor readActor(Long id) {
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("in_id", id);
        Map out = procReadActor.execute(in);
        Actor actor = new Actor();
        actor.setActorId(id);
        actor.setFirstName((String) out.get("out_first_name"));
        actor.setLastName((String) out.get("out_last_name"));
        actor.setLastUpdate((Date) out.get("out_birth_date"));
        return actor;
    }
}
