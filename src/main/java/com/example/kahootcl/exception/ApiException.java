package com.example.kahootcl.exception;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
@Component
@Data
public class ApiException extends RuntimeException{
    private HttpStatus status;
}