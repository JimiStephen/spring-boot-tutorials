package com.jimi.spring.framework.core.beans;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/17 9:28
 */
public class ServiceBeanImpl implements IServiceBean {

    @Override
    public String doing() {
        System.out.println("ServiceBeanImpl -  doing");
        return "done";
    }
}
