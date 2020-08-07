package com.jimi.spring.main;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        ExitCodeGenerator exitCodeGenerator = new ExitCodeGenerator() {
            @Override
            public int getExitCode() {
                return 42;
            }
        };
        //return () -> 42;
        return exitCodeGenerator;
    }

    public static void main(String[] args) {

        /**
         *
         * 定义程序退出代码 上面的bean就是对程序退出代码的定义。
         */
       /* System.exit(
                SpringApplication.exit(
                        SpringApplication.run(Application.class, args)
                )
        );*/

        SpringApplication.run(Application.class, args);
    }
}