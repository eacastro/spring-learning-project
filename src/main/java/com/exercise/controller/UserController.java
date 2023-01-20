package com.exercise.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.exercise.domain.User;
import com.exercise.repository.UserRepository;

@Controller
public class UserController {
	
	private final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/")
	public String getAllUsers(Model model) {
		var users = new ArrayList<User>();
		userRepository.findAll().forEach((user) -> {
			log.info("Current user data: " + user.toString());
			users.add(user);
		});
		
		model.addAttribute("users", users);
		return "index";
	}

}
