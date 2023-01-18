package com.exercise.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exercise.domain.User;
import com.exercise.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getAllUsers() {
		var u1 = new User();
		var u2 = new User();
		var u3 = new User();
		var u4 = new User();
		var u5 = new User();		
		
		u1.setName("Edisson");
		u1.setLastName("Castro");
		u1.setEmail("edissoncastro.11@hotamil.com");
		
		u2.setName("Nubia");
		u2.setLastName("Piza");
		u2.setEmail("napiza@misena.edu.co");
		
		u3.setName("John");
		u3.setLastName("Doe");
		u3.setEmail("john.doe@mail.com");
		
		u4.setName("Beto");
		u4.setLastName("Fya");
		u4.setEmail("beto.fya@fakemail.com");
		
		u5.setName("Ricardo");
		u5.setLastName("Bustos");
		u5.setEmail("ricardo.bustos@arra-in.co");
		
		var users = Arrays.asList(u1, u2, u3, u4, u5);
		
		return users;	
	}

}
