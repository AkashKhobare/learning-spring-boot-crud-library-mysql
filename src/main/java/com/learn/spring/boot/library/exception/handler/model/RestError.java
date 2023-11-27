package com.learn.spring.boot.library.exception.handler.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class RestError {

	private final LocalDateTime timestamp;
	private final HttpStatus httpStatus;
	private final String message;

	public RestError(HttpStatus httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.timestamp = LocalDateTime.now();
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public String getMessage() {
		return message;
	}

}
