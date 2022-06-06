package com.michaelroyf.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class BlogAPIException extends RuntimeException{
    private HttpStatus status;
    private  String message;

    public BlogAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public BlogAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
