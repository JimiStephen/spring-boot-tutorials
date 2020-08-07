package com.jimi.spring.framework.dataaccess.jdbc;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 11:07
 */
public class DriverManagerDataSourceDemo {
    public DriverManagerDataSource getDriverManagerDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
        dataSource.setUrl("jdbc:hsqldb:hsql://localhost:");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
        //xml config
      /*  <bean id = "dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource" >
            <property name = "driverClassName" value = "${jdbc.driverClassName}" / >
            <property name = "url" value = "${jdbc.url}" / >
            <property name = "username" value = "${jdbc.username}" / >
            <property name = "password" value = "${jdbc.password}" / >
            </bean >
            <context:
        property - placeholder location = "jdbc.properties" / >

        //DBCP
        <bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="${jdbc.driverClassName}"/>
        <property name="url" value="${jdbc.url}"/>
        <property name="username" value="${jdbc.username}"/>
        <property name="password" value="${jdbc.password}"/>
        </bean>
        <context:property-placeholder location="jdbc.properties"/>

        //C3P0
        <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource" destroy-method="close">
        <property name="driverClass" value="${jdbc.driverClassName}"/>
        <property name="jdbcUrl" value="${jdbc.url}"/>
        <property name="user" value="${jdbc.username}"/>
        <property name="password" value="${jdbc.password}"/>
        </bean>
        <context:property-placeholder location="jdbc.properties"/>

        */
    }
}
