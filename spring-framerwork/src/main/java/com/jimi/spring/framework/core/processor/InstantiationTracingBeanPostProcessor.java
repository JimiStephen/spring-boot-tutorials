package com.jimi.spring.framework.core.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {
    // simply return the instantiated bean as-is
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        // we could potentially return any object reference here...
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        System.out.println("InstantiationTracingBeanPostProcessor-Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}