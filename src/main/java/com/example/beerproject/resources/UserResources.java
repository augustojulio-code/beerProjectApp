package com.example.beerproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beerproject.entities.User;
import com.example.beerproject.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@Autowired
	private UserServices services;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list = services.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
}
