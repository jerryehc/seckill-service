package com.andy.seckill.common;

import com.andy.seckill.exception.ExceptionMessage;

import java.io.Serializable;

/**
 * <p>
 *
 * @author Leone
 **/
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1813924894386442775L;

    private String messages;

    private Integer code;

    private T data;

    private Result() {
    }

    private Result(String messages, Integer code, T data) {
        this.messages = messages;
        this.code = code;
        this.data = data;
    }

    private Result(ExceptionMessage exceptionMessage, T data) {
        this.messages = exceptionMessage.getMessage();
        this.code = exceptionMessage.getCode();
        this.data = data;
    }

    private Result(String messages, Integer code) {
        this.messages = messages;
        this.code = code;
    }

    public static <T> Result<T> build(String message, Integer code, T data) {
        return new Result<>(message, code, data);
    }

    public static <T> Result<T> error(String message, Integer code) {
        return new Result<>(message, code, null);
    }

    public static <T> Result<T> error(ExceptionMessage exceptionMessage) {
        return new Result<>(exceptionMessage, null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ExceptionMessage.SUCCESS, data);
    }

}