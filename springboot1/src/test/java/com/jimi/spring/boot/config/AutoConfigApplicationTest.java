package com.jimi.spring.boot.config;

import com.jimi.spring.boot.config.autoconfigure.ConditionAnnotationsConfiguration;
import com.jimi.spring.boot.config.service.UserService;
import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/10 15:00
 */
@SpringBootTest
public class AutoConfigApplicationTest {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(ConditionAnnotationsConfiguration.class));

    @Test
   public void defaultServiceBacksOff() {
        this.contextRunner.withUserConfiguration(UserConfiguration.class).run((context) ->
        {
            assertThat(context).hasSingleBean(UserService.class);
            assertThat(context).getBean("myUserService").isSameAs(context.getBean(UserService.class));
        });
    }

    @Test
    public void serviceNameCanBeConfigured() {
        this.contextRunner.withPropertyValues("user.name=test123").run((context) -> {
            assertThat(context).hasSingleBean(UserService.class);
            assertThat(context.getBean(UserService.class).getName()).isEqualTo("test123");
        });
    }

    @Test
    public void autoConfigTest (){
        ConditionEvaluationReportLoggingListener initializer = new
                ConditionEvaluationReportLoggingListener();

        ApplicationContextRunner contextRunner = new ApplicationContextRunner()
                .withInitializer(initializer).run((context) -> {
                    System.out.println("this is auto config test");
                    System.err.println(context.getId());
                });
    }

    @Test
    public void serviceIsIgnoredIfLibraryIsNotPresent() {
        this.contextRunner.withClassLoader(new FilteredClassLoader(UserService.class))
                .run((context) -> assertThat(context).doesNotHaveBean("userService"));
    }

    @Configuration
    @ConditionalOnClass(UserService.class)
    static class UserConfiguration {
        @Bean
        UserService myUserService() {
            return new UserService("mine");
        }
    }
}
