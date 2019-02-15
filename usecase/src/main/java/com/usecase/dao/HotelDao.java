package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;

import com.usecase.model.Hotel;

public interface HotelDao extends CrudRepository<Hotel, Integer> {

	Hotel findOneById(int id);

	Hotel delete(int id);

	Hotel update(int id);

	
	}
