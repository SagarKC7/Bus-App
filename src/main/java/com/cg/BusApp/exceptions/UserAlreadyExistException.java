package com.cg.BusApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.CONFLICT)
public class UserAlreadyExistException extends RuntimeException {
	
	public UserAlreadyExistException(){
		
	}
public UserAlreadyExistException(String s){
		super(s);
	}
}
