package com.solvd.laba.exception;

public class NoPlaneException extends Exception {
    public NoPlaneException(String message) {
        super("There is no planes ready to fly.") ;
        //Exception thrown in case that no planes are allowed to travel today.
    }
}
