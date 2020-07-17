package com.jimi.spring.framework.core.beans;

import javax.sql.DataSource;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/17 10:54
 */
public class JdbcAccountRepository implements AccountRepository {

    public JdbcAccountRepository(DataSource dataSource) {
    }
}
