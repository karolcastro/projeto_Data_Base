package com.my.project.exceptions;

public class DbException extends RuntimeException {
    public DbException(String msg) {
        super(msg);
    }
}