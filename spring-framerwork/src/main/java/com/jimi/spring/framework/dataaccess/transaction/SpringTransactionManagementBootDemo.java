package com.jimi.spring.framework.dataaccess.transaction;

import com.jimi.spring.framework.dataaccess.domain.Foo;
import com.jimi.spring.framework.dataaccess.service.FooService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringTransactionManagementBootDemo {
    public static void main(final String[] args) throws Exception {
        //com/jimi/spring/framework/dataaccess/transaction/spring-transaction-management.xml
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-transaction-management.xml", SpringTransactionManagementBootDemo.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-transaction-management.xml");
        FooService fooService = (FooService) ctx.getBean("fooService");
        fooService.insertFoo(new Foo());
    }
}