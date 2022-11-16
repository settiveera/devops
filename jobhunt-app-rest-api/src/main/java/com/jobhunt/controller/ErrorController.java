package com.jobhunt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jobhunt.exception.DuplicateJobIdException;
import com.jobhunt.exception.InvalidCredentialsException;
import com.jobhunt.exception.ProfileNotFoundException;

@RestControllerAdvice
public class ErrorController {
	
	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(InvalidCredentialsException.class)
	public String handleInvalidCredentialsException(Exception ex) {
		return ex.getMessage();
				
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(ProfileNotFoundException.class)
	public String handleProfileNotFoundException(Exception ex) {
		return ex.getMessage();
	}
	
	@ResponseStatus(code = HttpStatus.CONFLICT)
	@ExceptionHandler(DuplicateJobIdException.class)
	public String handleDuplicateJobIdException(Exception ex) {
		return ex.getMessage();
	}
}
