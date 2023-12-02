package com.learn.spring.boot.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.boot.library.model.User;
import com.learn.spring.boot.library.service.UserService;

@RestController
@RequestMapping("${app.api.path}/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public Long createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
}
