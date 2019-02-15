package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.model.Hotel;

@Repository
public interface HotelDao extends CrudRepository<Hotel, Integer> {

	Hotel findOneById(int id);

	Hotel delete(int id);

	 

	
	}
