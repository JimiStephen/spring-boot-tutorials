package com.jimi.spring.framework.core.beans;

public class ProcessorMessenger implements Messenger  {
    private String message = "Bingo";
    public String getMessage() {
// change the implementation to surround the message in quotes
        return "'" + this.message + "'";
    }
    public void setMessage(String message) {
        this.message = message;
    }
}