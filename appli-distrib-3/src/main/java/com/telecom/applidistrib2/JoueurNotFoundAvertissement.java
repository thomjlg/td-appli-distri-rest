package com.telecom.applidistrib2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class JoueurNotFoundAvertissement {

    @ResponseBody
    @ExceptionHandler(JoueurNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String joueurNotFoundHandler(JoueurNotFoundException ex) {
        return ex.getMessage();
    }
}