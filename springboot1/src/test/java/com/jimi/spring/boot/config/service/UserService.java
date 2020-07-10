package com.jimi.spring.boot.config.service;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Service;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/10 15:02
 */
public class UserService {

    private String name;
    public UserService(String name){
        this.name = name;
    }

    public String getName() {
        return null;
    }
}
