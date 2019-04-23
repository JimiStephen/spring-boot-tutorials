package com.jimi.spring.boot.mvc.conf;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.util.List;

/**
 * Created by jimiStephen on 2019-04-12.
 */
@Configuration
public class MvcMessageConfig {

    @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> additional = new HttpMessageConverter() {
            @Override
            public List<MediaType> getSupportedMediaTypes() {
                return null;
            }

            @Override
            public Object read(Class aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
                return null;
            }

            @Override
            public void write(Object o, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

            }

            @Override
            public boolean canWrite(Class aClass, MediaType mediaType) {
                return false;
            }

            @Override
            public boolean canRead(Class aClass, MediaType mediaType) {
                return false;
            }
        };
        HttpMessageConverter<?> another = new HttpMessageConverter() {
            @Override
            public List<MediaType> getSupportedMediaTypes() {
                return null;
            }

            @Override
            public Object read(Class aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
                return null;
            }

            @Override
            public void write(Object o, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

            }

            @Override
            public boolean canWrite(Class aClass, MediaType mediaType) {
                return false;
            }

            @Override
            public boolean canRead(Class aClass, MediaType mediaType) {
                return false;
            }
        };
        return new HttpMessageConverters(additional, another);
    }
}
