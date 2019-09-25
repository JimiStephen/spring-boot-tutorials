package com.jimi.spring.boot.listen;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyListen implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("---------listen" +  applicationEvent.getTimestamp());
        System.out.println("class name : " + applicationEvent.getSource().getClass().getName());       ;
    }
}
