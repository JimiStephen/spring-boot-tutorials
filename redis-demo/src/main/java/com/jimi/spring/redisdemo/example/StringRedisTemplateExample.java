package com.jimi.spring.redisdemo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.net.URL;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/3 11:24
 */
public class StringRedisTemplateExample {


    @Autowired
    private StringRedisTemplate redisTemplate;

    public void addLink(String userId, URL url) {
        redisTemplate.opsForList().leftPush(userId, url.toExternalForm());
    }
}
