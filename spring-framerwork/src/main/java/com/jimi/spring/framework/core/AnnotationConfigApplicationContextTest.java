package com.jimi.spring.framework.core;

import com.jimi.spring.framework.core.annotation.AnnotationAppConfig;
import com.jimi.spring.framework.core.annotation.AnnotationServiceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/16 14:11
 */
public class AnnotationConfigApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);

        AnnotationServiceBean myService = ctx.getBean(AnnotationServiceBean.class);
        myService.doStuff();
    }
}
