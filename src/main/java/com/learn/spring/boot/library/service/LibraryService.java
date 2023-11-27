package com.learn.spring.boot.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.boot.library.exception.LibraryNotFoundException;
import com.learn.spring.boot.library.model.Library;
import com.learn.spring.boot.library.repository.LibraryRepository;

@Service
public class LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;

	public List<Library> getLibraries() {
		return libraryRepository.findAll();
	}

	public Long createLibrary(final Library library) {
		return libraryRepository.save(library).getId();
	}

	public void deleteLibrary(final Long id) {
		libraryRepository.deleteById(id);
	}

	public Library getLibrary(final Long id) throws LibraryNotFoundException {
		final Library lib = libraryRepository.findById(id).orElseThrow(() -> {
			return new LibraryNotFoundException(id);
		});
		return lib;
	}

}
