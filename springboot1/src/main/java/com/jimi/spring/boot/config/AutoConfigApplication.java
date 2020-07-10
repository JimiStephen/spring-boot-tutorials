package com.jimi.spring.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/10 14:14
 */
@SpringBootApplication
public class AutoConfigApplication {

    public static void main(String[] args) {
        new SpringApplication(AutoConfigApplication.class).run(args);
    }

}
