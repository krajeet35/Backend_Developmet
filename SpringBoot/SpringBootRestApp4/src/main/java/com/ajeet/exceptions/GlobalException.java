package com.ajeet.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<ErrorDetails> studentException(StudentException e, WebRequest req){
		ErrorDetails err= new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> methodArgNotValidException(MethodArgumentNotValidException e){
		ErrorDetails err= new ErrorDetails(LocalDateTime.now(), "Validation error", e.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}

}
