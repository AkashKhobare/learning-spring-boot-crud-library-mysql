package com.learn.spring.boot.library.exception;

public class LibraryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7046625610851442023L;
	
	public LibraryNotFoundException(Long libraryId) {
		super("Library with id " + libraryId + " does not exists");
	}

}
