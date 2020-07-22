package com.jimi.spring.boot.web.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ObjectToStringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/21 16:04
 */
@Configuration
public class WebConfig {
    @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> additional = new ObjectToStringHttpMessageConverter(getConversionService());
        HttpMessageConverter<?> another = new ObjectToStringHttpMessageConverter(getConversionService());;
        return new HttpMessageConverters(additional, another);
    }

    @Bean
    public ConversionService getConversionService(){
        return new GenericConversionService();
    }

    /**
     * CORS Support
     * */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**");
            }
        };
    }
}
