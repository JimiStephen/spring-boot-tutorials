package com.jimi.spring.framework.core.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/17 9:26
 */
@Configuration
public class AppBeanConfigB {
    private  DataSource dataSource;

    public AppBeanConfigB(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public  DataSource dataSource(){
        //return datasource;
        return null;
    }
}
