package com.learn.spring.boot.library.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {

	@GetMapping
	public String getLibrary() {
		return "Library";
	}
	
}
