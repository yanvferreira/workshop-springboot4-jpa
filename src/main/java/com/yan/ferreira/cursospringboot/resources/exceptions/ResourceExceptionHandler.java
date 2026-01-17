package com.yan.ferreira.cursospringboot.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.yan.ferreira.cursospringboot.services.exceptions.DataBaseException;
import com.yan.ferreira.cursospringboot.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardErro> resourceNotFound(ResourceNotFoundException e, HttpServletRequest httpServletRequest) {
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardErro erro = new StandardErro(Instant.now(), status.value(), error, e.getMessage(), httpServletRequest.getRequestURI());

        return ResponseEntity.status(status).body(erro);
    }

    @ExceptionHandler(DataBaseException.class)
    public ResponseEntity<StandardErro> dataBase(DataBaseException e, HttpServletRequest httpServletRequest) {
        String error = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardErro erro = new StandardErro(Instant.now(), status.value(), error, e.getMessage(), httpServletRequest.getRequestURI());

        return ResponseEntity.status(status).body(erro);
    }
}
