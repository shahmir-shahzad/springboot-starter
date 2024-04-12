package com.shahmir.basicwebapparchitecture.exceptions.handlers;

import com.shahmir.basicwebapparchitecture.exceptions.ApiError;
import com.shahmir.basicwebapparchitecture.exceptions.NoProductFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Date;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = NoProductFoundException.class)
    public ResponseEntity<Object> handleNoProductException(NoProductFoundException e){
        System.out.println("exception handler executed!");
        ApiError err = new ApiError(400,e.getMessage(),new Date());
        System.out.println("Api Error: "+ err);
        return new ResponseEntity<Object>(err,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NoResourceFoundException.class)
    public ResponseEntity<Object> handleNoControllerFoundException(NoResourceFoundException e){
        System.out.println("Controller not found");
        ApiError err = new ApiError(404, e.getMessage(),new Date());
        return new ResponseEntity<Object>(err, HttpStatus.NOT_FOUND);

    }

}
