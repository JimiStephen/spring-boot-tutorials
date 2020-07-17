package com.jimi.spring.framework.core;

import com.jimi.spring.framework.core.beans.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/17 10:47
 */
public class CombiningJavaXmlConifgDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring/config/system-test-config.xml");
        TransferService transferService = ctx.getBean(TransferService.class);

    }
}
