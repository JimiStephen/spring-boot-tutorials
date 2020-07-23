package com.jimi.spring.boot.sql.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/22 16:17
 */
@Component
public class JdbcTemplateBean {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTemplateBean(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
