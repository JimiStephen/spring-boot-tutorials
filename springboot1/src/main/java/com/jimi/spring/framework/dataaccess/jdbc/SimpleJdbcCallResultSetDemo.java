package com.jimi.spring.framework.dataaccess.jdbc;

import com.jimi.spring.framework.dataaccess.jdbc.domain.Actor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 14:40
 */
public class SimpleJdbcCallResultSetDemo {
    /*
        CREATE PROCEDURE read_all_actors()
        BEGIN
        SELECT a.id, a.first_name, a.last_name, a.birth_date FROM t_actor a;
        END;
        */
    private SimpleJdbcCall procReadAllActors;


    public void setDataSource(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        this.procReadAllActors = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("read_all_actors")
                .returningResultSet("actors",
                        BeanPropertyRowMapper.newInstance(Actor.class));
    }
    public List getActorsList() {
        Map m = procReadAllActors.execute(new HashMap<String, Object>(0));
        return (List) m.get("actors");
    }
}
