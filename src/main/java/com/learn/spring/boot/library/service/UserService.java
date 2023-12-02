package com.learn.spring.boot.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.boot.library.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Long createUser(User user) {
		return userRepository.save(user).getId();
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
}
