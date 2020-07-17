package com.jimi.spring.framework.core.javaconfig;

import com.jimi.spring.framework.core.beans.*;
import org.springframework.context.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/17 9:26
 */
@Configuration
@Import(AppBeanConfigB.class)
public class AppBeanConfig {


    @Bean
    public IServiceBean getServiceBean(){
        return new ServiceBeanImpl();
    }

    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public TransferService transferService(AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }

    @Bean(name = {"accountRepository","accountRs"})// bean alias
    @Scope("prototype") //    @SessionScope
    @Description("this is account database dao bean")//bean description
    public AccountRepository accountRepository(){
        return new AccountRepositoryImpl();
    }

}
