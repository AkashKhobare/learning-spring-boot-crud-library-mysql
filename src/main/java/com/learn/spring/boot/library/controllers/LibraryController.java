package com.learn.spring.boot.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.boot.library.model.Library;
import com.learn.spring.boot.library.service.LibraryService;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;

	@GetMapping
	public List<Library> getLibraries() {
		return libraryService.getLibraries();
	}

	@PostMapping
	public Long createLibrary(@RequestBody Library library) {
		return libraryService.createLibrary(library);
	}

	@DeleteMapping
	public void deleteLibrary(@RequestParam Long id) {
		libraryService.deleteLibrary(id);
	}

}
