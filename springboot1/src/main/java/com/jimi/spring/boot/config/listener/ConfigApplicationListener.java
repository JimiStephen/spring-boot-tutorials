package com.jimi.spring.boot.config.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/13 16:01
 */
public class ConfigApplicationListener<ApplicationEvent> implements ApplicationListener {


    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(org.springframework.context.ApplicationEvent event) {
        System.out.println("ConfigApplicationListener onApplicationEvent()");
    }
}
