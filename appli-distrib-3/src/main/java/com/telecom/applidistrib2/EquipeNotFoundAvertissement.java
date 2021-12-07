package com.telecom.applidistrib2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class EquipeNotFoundAvertissement {

    @ResponseBody
    @ExceptionHandler(EquipeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String equipeNotFoundHandler(EquipeNotFoundException ex) {
        return ex.getMessage();
    }
}