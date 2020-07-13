package com.jimi.spring.boot.config.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/13 15:50
 */
public class ConfigApplicationContextInitializer<ConfigurableApplicationContext> implements ApplicationContextInitializer {


    /**
     * Initialize the given application context.
     *
     * @param applicationContext the application to configure
     */
    @Override
    public void initialize(org.springframework.context.ConfigurableApplicationContext applicationContext) {
        System.out.println("ConfigApplicationContextInitializer initialize()");
    }
}
