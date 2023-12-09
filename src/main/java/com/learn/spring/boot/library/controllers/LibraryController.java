package com.learn.spring.boot.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.boot.library.model.Library;
import com.learn.spring.boot.library.service.LibraryService;

@RestController
@RequestMapping("${app.api.path}/users/{user_id}/libraries")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;

	@GetMapping
	public List<Library> getLibraries(@PathVariable("user_id") Long userId) {
		return libraryService.getLibraries(userId);
	}
	
	@GetMapping("/{id}")
	public Library getLibrary(@PathVariable Long id) {
		return libraryService.getLibrary(id);
	}

	@PostMapping
	public Long createLibrary(@PathVariable("user_id") Long userId, @RequestBody Library library) {
		return libraryService.createLibrary(userId, library);
	}

	@DeleteMapping
	public void deleteLibrary(@RequestParam Long id) {
		libraryService.deleteLibrary(id);
	}

}
