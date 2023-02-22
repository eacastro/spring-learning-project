package com.exercise.dto;

import com.exercise.domain.User;

import lombok.Data;

@Data
public class UserCreationResult {
	private boolean success;
	private String message;
	private User data;
}
