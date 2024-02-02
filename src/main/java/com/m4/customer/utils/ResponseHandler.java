package com.m4.customer.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
    public static ResponseEntity<Object> buildResponseEntity(String message,HttpStatus status,Object response){
        Map<String,Object> map=new HashMap<String , Object>();
        map.put("message", message);
        map.put("status", status);
        map.put("data", response);
        return new ResponseEntity<Object>(map,status);

    }
}
