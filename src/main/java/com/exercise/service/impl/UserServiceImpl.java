package com.exercise.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.domain.User;
import com.exercise.repository.UserRepository;
import com.exercise.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
		
	private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public List<User> getAllUsers() {
//		var allUsers = userRepository.findAll();
//		var users = new ArrayList<User>();
//		
//		if (allUsers != null) {
//			log.info("Se recupera iterable desde la interfaz repository");
//			allUsers.forEach(users :: add);
//		}
//		
//		return users;
		return null;
	}

}
