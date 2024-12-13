package com.example.kahootcl.exception;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiException extends RuntimeException{
    private HttpStatus status;

    public ApiException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}