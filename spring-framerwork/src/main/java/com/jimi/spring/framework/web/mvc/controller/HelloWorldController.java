package com.jimi.spring.framework.web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//<?xml version="1.0" encoding="UTF-8"?>
//<beans xmlns="http://www.springframework.org/schema/beans"
//        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//        xmlns:p="http://www.springframework.org/schema/p"
//        xmlns:context="http://www.springframework.org/schema/context"
//        xsi:schemaLocation="
//        http://www.springframework.org/schema/beans
//        http://www.springframework.org/schema/beans/spring-beans.xsd
//        http://www.springframework.org/schema/context
//        http://www.springframework.org/schema/context/spring-context.xsd">
//<context:component-scan base-package="com.jimi.spring.framework.web.mvc.controller"/>
//<!-- ... -->
//</beans>

//Defining a controller with @Controller
@Controller

public class HelloWorldController {
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }
}