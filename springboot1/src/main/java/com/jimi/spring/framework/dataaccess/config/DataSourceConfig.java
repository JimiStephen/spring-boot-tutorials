package com.jimi.spring.framework.dataaccess.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource dataSource() {
        /*
        //equailal
        <jdbc:embedded-database id="dataSource" generate-name="true">
        <jdbc:script location="classpath:schema.sql"/>
        <jdbc:script location="classpath:test-data.sql"/>
        </jdbc:embedded-database>
        */
        /*
        Generating unique names for embedded databases
        • EmbeddedDatabaseFactory.setGenerateUniqueDatabaseName()
        • EmbeddedDatabaseBuilder.generateUniqueName()
        • <jdbc:embedded-database generate-name="true" … >
        */
        return new EmbeddedDatabaseBuilder()
                .generateUniqueName(true)
                .setType(H2)
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .addScript("schema.sql")
                .addScripts("user_data.sql", "country_data.sql")
                .build();
    }
}