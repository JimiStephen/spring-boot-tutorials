package com.jimi.spring.boot.config.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/10 14:16
 * @AutoConfigureAfter
 */
@Configuration
@AutoConfigureBefore
@AutoConfigureOrder
public class LibXWebAutoConfiguration {
    private String configName = "LibXWebAutoConfiguration";

}
