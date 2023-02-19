package com.aurionpro.model;

public class InvalidAgeException extends Exception {

	private String message;

	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.getClass() +" "+ message;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [message=" + message + "]";
	}
	
//	public InvalidAgeException(String message) {
//		super(message);
//	}
	
	

}
