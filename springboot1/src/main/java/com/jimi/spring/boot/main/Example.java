package com.jimi.spring.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
    /**
     * The first annotation on our Example class is @RestController. This is known as a stereotype annotation.
     * It provides hints for people reading the code and for Spring that the class plays a specific role.
     * In this case, our class is a web @Controller, so Spring considers it when handling incoming web requests.
     * The @RequestMapping annotation provides “routing” information. It tells javax.swing.Spring
     * that any HTTP request with the / path should be mapped to the home method.
     * The @RestController annotation tells Spring to render the resulting string directly back to the caller.
     */
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}