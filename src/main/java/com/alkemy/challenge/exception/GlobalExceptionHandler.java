package com.alkemy.challenge.exception;


import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    private final static  Logger logger= Logger.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> allErrors(Exception ex, WebRequest req){
        logger.error((ex.getMessage()));
        return new ResponseEntity("Error -"+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
