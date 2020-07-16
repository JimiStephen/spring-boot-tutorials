package com.jimi.spring.boot.config;

import com.google.common.collect.Lists;
import com.jimi.spring.boot.config.initializer.ConfigApplicationContextInitializer;
import com.jimi.spring.boot.config.listener.ConfigApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/10 14:14
 */
@SpringBootApplication
public class AutoConfigApplication {

    public static void main(String[] args) {
        SpringApplication springApplication =   new SpringApplication(AutoConfigApplication.class);
        //Customize the Environment or ApplicationContext Before It Starts
        //method one
        List<ApplicationContextInitializer<ConfigurableApplicationContext>> initializers = Lists.newArrayList(new ConfigApplicationContextInitializer<>());
        springApplication.setInitializers(initializers);
        //method two
        springApplication.addListeners(new ConfigApplicationListener<ApplicationEvent>());
        springApplication.run(args);
    }


}
