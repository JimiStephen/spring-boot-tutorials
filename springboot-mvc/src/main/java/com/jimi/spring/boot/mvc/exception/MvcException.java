package com.jimi.spring.boot.mvc.exception;

/**
 * Created by jimiStephen on 2019-04-12.
 */
public class MvcException extends Throwable {

    private int status = 0;
    public MvcException(int status,String message){
        super(message);
        this.status = status;
    }
}
