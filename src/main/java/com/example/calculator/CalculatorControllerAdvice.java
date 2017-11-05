package com.example.calculator;

import com.example.calculator.exception.ComputationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class CalculatorControllerAdvice {

    @ExceptionHandler(ComputationException.class)
    public ResponseEntity<String> ValueNotFoundException(ComputationException e) {
        String message = e.getMessage();
        ResponseEntity responseEntity = new ResponseEntity(message, HttpStatus.BAD_REQUEST);
        return responseEntity;
    }
}
