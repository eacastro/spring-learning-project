package com.exercise.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exercise.domain.User;
import com.exercise.dto.UserCreationResult;
import com.exercise.repository.UserRepository;
import com.exercise.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	private final Logger log = LoggerFactory.getLogger(UserController.class);

	// CRUD operations with Spring Boot:
	// ---------------------------------

	// CREATE:
	@PostMapping("/create")
	public String createUser(@RequestBody User user) {
		log.debug("createUser");
		// TODO: ¿Cómo validar un objeto de petición con Spring?
		// TODO: ¿Qué pasaría si user viene null?
		// TODO: ¿Qué pasaría si user.getName() viene null?
		// TODO: ¿Qué pasaría si user.getLastName() viene null?
		// TODO: ¿Qué pasaría si user.getEmail() viene null?
		// TODO: Gestionar qué pasa cuando se envía un usuario repetido
		//       (Que sus atributos son iguales a los de algún objeto almacenado en BD).
		userService.saveUser(user);		
		return "index";
	}

	// READ:
	// UPDATE:
	// DELETE:

	@GetMapping("/")
	public String getAllUsers(Model model) {
		var users = new ArrayList<User>();
		userRepository.findAll().forEach((user) -> {
			users.add(user);
		});

		model.addAttribute("users", users);
		return "index";
	}

}
