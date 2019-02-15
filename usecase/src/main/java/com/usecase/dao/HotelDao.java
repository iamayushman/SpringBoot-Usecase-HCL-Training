package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;

import com.usecase.model.Hotel;
import com.usecase.model.User;

public interface HotelDao extends CrudRepository<Hotel, Integer> {

	
	}
