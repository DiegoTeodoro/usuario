package com.javanauta.usuario.infrastructure.exceptions;

public class ConfictException extends RuntimeException {

    public ConfictException(String message) {
        super(message);
    }

    public ConfictException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
