package com.exercise.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.domain.User;
import com.exercise.dto.UserCreationResult;
import com.exercise.repository.UserRepository;
import com.exercise.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		log.info("getAllUsers has started");
		var allUsers = userRepository.findAll();
		var users = new ArrayList<User>();

		if (allUsers != null) {
			log.info("Se recupera iterable desde la interfaz repository");
			allUsers.forEach(users::add);
		}

		return users;
	}

	@Override
	public User findUserById(Long userId) {
		log.info("findUserById has started");
		return userRepository.findById(userId).orElse(null);
	}

	@Override
	public void deleteUser(Long userId) {
		log.info("deleteUser has started");
		userRepository.deleteById(userId);		
	}

	@Override
	public UserCreationResult saveUser(User user) {
		log.info("saveUser has started");
		User userCreated = userRepository.save(user);
		UserCreationResult result = new UserCreationResult();
		
		if (userCreated != null) {
			log.info("user created");			
			result.setSuccess(true);
			result.setMessage("Usuario creado exitosamente");
			result.setData(userCreated);
		} else {
			log.info("user not created");
			result.setSuccess(false);
			result.setMessage("No fue posible crear el usuario solicitado");
			result.setData(null);
		}
		
		return result;
	}

}
