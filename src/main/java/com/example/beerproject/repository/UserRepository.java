package com.example.beerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beerproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
