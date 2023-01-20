package com.exercise.repository;

import org.springframework.data.repository.CrudRepository;

import com.exercise.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
