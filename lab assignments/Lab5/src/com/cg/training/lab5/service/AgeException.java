package com.cg.training.lab5.service;

public class AgeException extends Exception{

	private String message;

	public AgeException() {

	}

	public AgeException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
