package com.example.beerproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beerproject.entities.User;
import com.example.beerproject.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
	}
	
	public User findByid(Long id) {
		
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
