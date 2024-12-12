package com.example.kahootcl.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {


    public ResponseEntity<KahootExceptionResponse> exceptionHandler(KahootException exception){
        KahootExceptionResponse response = new KahootExceptionResponse(exception.getMessage(), exception.getStatus(), System.currentTimeMillis());
        return new ResponseEntity<>(response,exception.getStatus());
    }


    public ResponseEntity<KahootExceptionResponse> generalExceptionHandler(Exception exception){
        KahootExceptionResponse response = new KahootExceptionResponse(exception.getMessage(), HttpStatus.BAD_REQUEST, System.currentTimeMillis());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
}