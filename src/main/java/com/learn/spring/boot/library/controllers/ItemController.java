package com.learn.spring.boot.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.boot.library.model.Item;
import com.learn.spring.boot.library.service.ItemService;

@RestController
@RequestMapping("${app.api.path}/libraries/{library_id}/items")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@PostMapping
	public Long createItem(@PathVariable("library_id") Long libraryId, @RequestBody Item item) {
		return itemService.createItem(libraryId, item);
	}

	@GetMapping
	public List<Item> getItems(@PathVariable("library_id") Long libraryId) {
		return itemService.getItems(libraryId);
	}
	
	@DeleteMapping
	public void deleteItems(@PathVariable("library_id") Long libraryId) {
		itemService.deleteItems(libraryId);
	}
	
	@DeleteMapping("/{item_id}")
	public void deleteItem(@PathVariable("item_id") Long itemId) {
		itemService.deleteItem(itemId);
	}

}
