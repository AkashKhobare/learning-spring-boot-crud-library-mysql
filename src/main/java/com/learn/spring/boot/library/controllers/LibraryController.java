package com.learn.spring.boot.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.boot.library.model.Library;
import com.learn.spring.boot.library.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;
	
	@GetMapping
	public List<Library> getLibrary() {
		return libraryService.getLibraries();
	}
	
}
