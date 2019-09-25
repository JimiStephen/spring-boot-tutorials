package com.jimi.spring.boot.main.xml;

import com.jimi.spring.boot.xml.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.Collections;


@EnableAutoConfiguration

/**
 * 要加上这个注释才会运行。
 * 要不会提示错误：Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean
 */
public class SampleSpringXmlApplication implements CommandLineRunner {


    private static final String CONTEXT_XML = "classpath:/META-INF/application-context.xml";


    @Autowired

    private HelloWorldService helloWorldService;


    @Override

    public void run(String... args) {

        System.out.println(this.helloWorldService.getHelloMessage());

    }


    public static void main(String[] args) {

        SpringApplication application = new SpringApplication();

        application.setSources(Collections.singleton(CONTEXT_XML));

        application.run(args);

    }


}