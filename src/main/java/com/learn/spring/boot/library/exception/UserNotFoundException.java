package com.learn.spring.boot.library.exception;

public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 6227695920900074063L;

	public UserNotFoundException(Long userId) {
		super("User with id " + userId + " does not exists");
	}

}
