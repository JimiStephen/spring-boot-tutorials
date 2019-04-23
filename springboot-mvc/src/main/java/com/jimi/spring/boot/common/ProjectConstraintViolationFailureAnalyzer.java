package com.jimi.spring.boot.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * Created by jimiStephen on 2019-04-23.
 */

public class ProjectConstraintViolationFailureAnalyzer implements FailureAnalyzer {
    private static Logger logger = LoggerFactory.getLogger(ProjectConstraintViolationFailureAnalyzer.class);

    @Override
    public FailureAnalysis analyze(Throwable throwable) {
        logger.error("",throwable);

        FailureAnalysis failureAnalysis = new FailureAnalysis("project error","error",throwable);
        return failureAnalysis;
    }
}
