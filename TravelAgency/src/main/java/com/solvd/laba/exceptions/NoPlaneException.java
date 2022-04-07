package com.solvd.laba.exceptions;

public class NoPlaneException extends Exception {
    public NoPlaneException(String message) {
        super(message);
        //Exception thrown in case that no planes are allowed to travel today.
    }
}
