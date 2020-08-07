package com.jimi.spring.framework.core;

import com.jimi.spring.framework.core.beans.Messenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/16 15:27
 */
public class BeanPostProcessorTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jimi/spring/config/application-processor-beans.xml");
        Messenger messenger = (Messenger) ctx.getBean("processorMessenger");
        System.out.println(messenger);
    }
}
