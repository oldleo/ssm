package com.cdinit.exception;

/**
 * Author: sun_chuan
 * Date: 2018/5/28
 * Time: 16:12
 * Description:
 */
public class CustomException extends Exception{
    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}