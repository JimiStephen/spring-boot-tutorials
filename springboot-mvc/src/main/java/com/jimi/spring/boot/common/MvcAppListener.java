package com.jimi.spring.boot.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * Created by jimiStephen on 2019-04-23.
 */
public class MvcAppListener implements ApplicationListener {
    private static Logger logger = LoggerFactory.getLogger(MvcAppListener.class);

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        logger.info("app start time is {}", String.valueOf(new Date(applicationEvent.getTimestamp())));

        logger.info("app source is {}", applicationEvent.getSource().getClass().getSimpleName());

    }
}
