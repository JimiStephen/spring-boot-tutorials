package com.jimi.spring.boot.web.controller;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/22 14:28
 */
public class ControllerErrorType {

    private Integer errorStatus;

    private String errorMsg;

    public ControllerErrorType(Integer errorStatus, String errorMsg) {
        this.errorStatus = errorStatus;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(Integer errorStatus) {
        this.errorStatus = errorStatus;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
