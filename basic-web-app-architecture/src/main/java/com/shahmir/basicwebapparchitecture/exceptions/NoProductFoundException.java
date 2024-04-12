package com.shahmir.basicwebapparchitecture.exceptions;

public class NoProductFoundException extends RuntimeException{

    public NoProductFoundException(String message){
        super(message);
    }
}
