package com.hexa.QuitQ.exception;
 
import org.springframework.http.HttpStatus;
 
public class CRUDAPIException extends RuntimeException {
 
    private HttpStatus status;
    private String message;
 
    public CRUDAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
 
    public CRUDAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }
 
    public HttpStatus getStatus() {
        return status;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
}
 