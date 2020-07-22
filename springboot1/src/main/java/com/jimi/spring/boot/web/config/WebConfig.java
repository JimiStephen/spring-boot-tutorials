package com.jimi.spring.boot.web.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ObjectToStringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

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

    @Bean
    public ConfigurableServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setPort(9000);
//        factory.setSessionTimeout(10, TimeUnit.MINUTES);
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
        return factory;
    }
}
