package com.jimi.spring.framework.core.container;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/16 14:52
 */
public class NoWebContainer {

    public static void main(String[] args) {
        ConfigurableApplicationContext configCtx = new ClassPathXmlApplicationContext(
                new String[]{"beans.xml"}
        );

        configCtx.registerShutdownHook();
    }
}
