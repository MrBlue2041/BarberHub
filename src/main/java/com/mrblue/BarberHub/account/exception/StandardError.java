package com.mrblue.BarberHub.account.exception;

public class StandardError {
    private Integer status;
    private String message;

    public StandardError(){};

    public StandardError(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
