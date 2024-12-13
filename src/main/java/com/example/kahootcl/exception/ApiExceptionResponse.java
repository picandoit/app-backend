package com.example.kahootcl.exception;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiExceptionResponse {
    private int status;
    private String message;
    private long timeStamps;
    public ApiExceptionResponse(String message, HttpStatus status, long timeStamps) {
        this.message = message;
        this.status = status.value();
        this.timeStamps = timeStamps;
    }
}