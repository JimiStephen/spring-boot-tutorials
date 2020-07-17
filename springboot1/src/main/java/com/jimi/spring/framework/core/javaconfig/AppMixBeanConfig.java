package com.jimi.spring.framework.core.javaconfig;

import com.jimi.spring.framework.core.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/17 9:26
 */
@Configuration
public class AppMixBeanConfig {


    @Autowired
    private DataSource dataSource;

    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository(dataSource);
    }
    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl(accountRepository());
    }
}
