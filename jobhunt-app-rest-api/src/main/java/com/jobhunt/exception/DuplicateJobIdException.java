package com.jobhunt.exception;

public class DuplicateJobIdException extends RuntimeException {
	
	public DuplicateJobIdException(String msg) {
		super(msg);
	}
}
