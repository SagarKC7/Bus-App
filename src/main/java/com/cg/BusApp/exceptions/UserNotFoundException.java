package com.cg.BusApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.CONFLICT)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException() {
		
	}
public UserNotFoundException(String s) {
	super(s);
		
	}
}
