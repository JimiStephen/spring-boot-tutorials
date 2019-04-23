package com.jimi.spring.boot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jimiStephen on 2019-04-23.
 */

@Component
public class ApplicationArgumentsBean {
    @Autowired
    public ApplicationArgumentsBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();

        System.out.println("args.getSourceArgs() " + args.getSourceArgs());
// if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
    }
}
