package com.shahmir.basicwebapparchitecture.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> CreateResponse(String message, Object obj, HttpStatus status){
        Map<String,Object> respMap = new HashMap<>();
        respMap.put("message", message);
        respMap.put("data",obj);
        return new ResponseEntity<>(respMap,status);
    }
}
