package com.practice.service;

import org.springframework.stereotype.Service;

import com.practice.repository.UserRepository;

@Service
public class UserService {

	public final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public String saveUser() {
		boolean f = userRepository.save();
		if(f) {
			return "register success";
		}
		else 
			return "register fail";
	}
}
