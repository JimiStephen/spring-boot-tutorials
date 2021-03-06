package com.jimi.spring.boot.main.prof;


import com.jimi.spring.boot.prof.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.jimi.spring.boot.prof.service")
public class SampleProfileApplication implements CommandLineRunner {


    // Simple example shows how a command line spring application can execute an

    // injected bean service. Also demonstrates how you can use @Value to inject

    // command line args ('--name=whatever') or application properties


    @Autowired

    private MessageService helloWorldService;


    @Override

    public void run(String... args) {
        System.out.println(SampleProfileApplication.class.getSimpleName() + " start ...");
        System.out.println(this.helloWorldService.getMessage());

    }


    public static void main(String[] args) {

        SpringApplication.run(SampleProfileApplication.class, args);

    }


}