package com.jimi.spring.framework.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class StandaloneDataConfig {
    @Bean
    @Profile("dev")
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("classpath:data.sql")
                .addScript("classpath:schema.sql")
                .build();
    }


    @Bean
    @Profile("production")
    public DataSource dataSourceOth() {
        Context ctx = null;
        DataSource dataSource = null;
        try {
            ctx = new InitialContext();
        } catch (NamingException e) {
            e.printStackTrace();
        }
        try {
            dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/datasource");
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}