package org.simplilearn.controllers;

import java.time.LocalDateTime;

import org.simplilearn.exceptions.EmployeeNotFoundException;
import org.simplilearn.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(EmployeeNotFoundException e)
	{
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setStatusCode(HttpStatus.NO_CONTENT.value());
		errorResponse.setErrorMessage(e.getMessage());
		errorResponse.setTimeStamp(LocalDateTime.now());
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.OK);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception e)
	{
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
		errorResponse.setErrorMessage(e.getMessage());
		errorResponse.setTimeStamp(LocalDateTime.now());
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.OK);
	}
}
