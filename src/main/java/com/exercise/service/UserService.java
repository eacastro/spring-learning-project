package com.exercise.service;

import java.util.List;

import com.exercise.domain.User;
import com.exercise.dto.UserCreationResult;

public interface UserService {
	List<User> getAllUsers();
	User findUserById(Long userId);
	void deleteUser(Long userId);
	UserCreationResult saveUser(User user);
}
