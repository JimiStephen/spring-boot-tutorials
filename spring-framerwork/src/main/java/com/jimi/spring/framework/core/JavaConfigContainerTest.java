package com.jimi.spring.framework.core;

import com.jimi.spring.framework.core.beans.IServiceBean;
import com.jimi.spring.framework.core.javaconfig.AppBeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/16 17:53
 */
public class JavaConfigContainerTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppBeanConfig.class);
        IServiceBean myService = ctx.getBean(IServiceBean.class);
        myService.doing();
    }
}
