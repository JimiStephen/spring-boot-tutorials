package com.jimi.spring.framework.core;

import com.jimi.spring.framework.core.annotation.AnnotationAppConfig;
import com.jimi.spring.framework.core.annotation.AnnotationServiceBean;
import com.jimi.spring.framework.core.annotation.OtherAnnotationAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/16 14:11
 */
public class AnnotationRegisterConfigApplicationContextTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(OtherAnnotationAppConfig.class);
        ctx.register(AnnotationAppConfig.class);
//        ctx.scan("com.jimi.spring.framework.core");

        ctx.refresh();

        AnnotationServiceBean myService = ctx.getBean(AnnotationServiceBean.class);
        myService.doStuff();
    }
}
