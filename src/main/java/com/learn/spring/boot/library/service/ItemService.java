package com.learn.spring.boot.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.boot.library.exception.LibraryNotFoundException;
import com.learn.spring.boot.library.model.Item;
import com.learn.spring.boot.library.model.Library;
import com.learn.spring.boot.library.repository.ItemRepository;
import com.learn.spring.boot.library.repository.LibraryRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private LibraryRepository libraryRepository;

	public Long createItem(Long libraryId, Item item) {
		final Library lib = libraryRepository.findById(libraryId).orElseThrow(() -> {
			return new LibraryNotFoundException(libraryId);
		});

		item.setLibrary(lib);
		return itemRepository.save(item).getId();
	}

	public List<Item> getItems(Long libraryId) {		
		if(!libraryRepository.existsById(libraryId)) {
			throw new LibraryNotFoundException(libraryId);			
		}

		return itemRepository.findByLibraryId(libraryId);
	}

}
