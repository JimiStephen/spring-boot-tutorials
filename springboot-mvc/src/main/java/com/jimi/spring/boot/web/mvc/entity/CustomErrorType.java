package com.jimi.spring.boot.web.mvc.entity;

public class CustomErrorType {
    private int statusCode;
    private String errorContent;

    public CustomErrorType(int statusCode, String errorContent) {
        this.statusCode = statusCode;
        this.errorContent = errorContent;

    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorContent() {
        return errorContent;
    }

    public void setErrorContent(String errorContent) {
        this.errorContent = errorContent;
    }


}
