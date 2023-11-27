package com.learn.spring.boot.library.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.learn.spring.boot.library.exception.handler.model.RestError;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

	@ExceptionHandler
	public ResponseEntity<Object> genericHandler(Exception e) {
		logger.error(e.getMessage(), e);
		return buildResponseEntity(new RestError(HttpStatus.BAD_REQUEST, e.getLocalizedMessage()));
	}

	private ResponseEntity<Object> buildResponseEntity(RestError restError) {
		return new ResponseEntity<>(restError, restError.getHttpStatus());
	}
	
}
