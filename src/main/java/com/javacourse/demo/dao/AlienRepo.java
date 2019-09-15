package com.javacourse.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.javacourse.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
