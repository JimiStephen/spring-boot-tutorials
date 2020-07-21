package com.jimi.spring.boot.config.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
/**
 * <方法说明>
 * application.properties
 * spring.profiles.active=dev,hsqldb
 * equals to
 * --spring.profiles.active=dev,hsqldb.
 * and
 * SpringApplication.setAdditionalProfiles(...)
 * @author jimi
 * @date 2020/7/21 15:28
 */
@Configuration()
@Profile("production")
public class ProductionConfiguration {
// ...
}