package com.example.beerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beerproject.entities.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long> {

}
