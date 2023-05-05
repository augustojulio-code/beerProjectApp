package com.example.beerproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beerproject.entities.Beer;
import com.example.beerproject.services.BeerServices;

@RestController
@RequestMapping(value = "/beers")
public class BeerResources {
	
	@Autowired
	private BeerServices services;
	
	@GetMapping
	public ResponseEntity<List<Beer>> findAll(){
		
		List<Beer> list = services.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
}
