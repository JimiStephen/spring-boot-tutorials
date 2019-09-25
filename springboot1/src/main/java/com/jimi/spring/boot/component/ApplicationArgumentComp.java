package com.jimi.spring.boot.component;


import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationArgumentComp {

    public ApplicationArgumentComp(ApplicationArguments appArgs){
        boolean debug = appArgs.containsOption("debug");
        System.out.println("content option debug :" + debug);
        List<String> files = appArgs.getNonOptionArgs();
        for(String item : files){
            System.out.println(item);
        }
    }
}
