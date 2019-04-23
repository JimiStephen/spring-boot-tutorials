package com.jimi.spring.boot.conf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jimiStephen on 2019-04-23.
 */
@Component
public class CommandRunnerBean implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("CommandRunnerBean");
        System.out.println(strings);
    }
}
