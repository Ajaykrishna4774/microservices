package com.spring.cts.user.dao;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.user.pojo.User;



public interface UserRepository extends CrudRepository<User,String>{

	Iterable<User> findAll();

	User findByUsernameAndPasswordAndConfirmed(String username, String password, String string);

	Optional<User> findByEmail(String emailId);

	

	
}
