package com.example.beerproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beerproject.entities.Beer;
import com.example.beerproject.repository.BeerRepository;

@Service
public class BeerServices {
	
	@Autowired
	private BeerRepository repository;
	
	public List<Beer> findAll(){
		
		return repository.findAll();
	}
}
