package com.jimi.spring.boot.sql.config;

import com.jimi.spring.boot.sql.domain.City;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackageClasses= City.class)
public class JdbcApplicationConfig {

}