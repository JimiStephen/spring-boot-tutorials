package com.jimi.spring.boot.config.autoconfigure;

import com.jimi.spring.boot.config.conditions.EmbededClassService;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// Some conditions
@ConditionalOnProperty(prefix = "logging" ,name = {"mapper"})
@ConditionalOnResource(resources = {"classpath:/META-INF/application-context.xml"})
@ConditionalOnWebApplication
public class ConditionAnnotationsConfiguration {
    // Auto-configured beans
    @Configuration
    @ConditionalOnClass(EmbededClassService.class)
    static class EmbeddedConfiguration {
        @Bean
        @ConditionalOnMissingBean
        public EmbededClassService embededClassService() {
            return new EmbededClassService();
        }
    }
}