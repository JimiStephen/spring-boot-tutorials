package com.jimi.spring.boot.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jimiStephen on 2019-04-23.
 */
@Component
public class AppProperties {
    public String getLoggerFile() {
        return loggerFile;
    }

    @Value("${logging.file}")
    private String loggerFile;
}
