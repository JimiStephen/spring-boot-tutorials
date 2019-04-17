package com.jimi.spring.boot.mvc.conf;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * Created by jimiStephen on 2019-04-12.
 */
@Configuration
public class MvcMessageConfig {

    @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> additional = null;
        HttpMessageConverter<?> another = null;
        return new HttpMessageConverters(additional, another);
    }
}
