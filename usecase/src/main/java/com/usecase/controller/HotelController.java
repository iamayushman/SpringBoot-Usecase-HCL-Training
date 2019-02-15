package com.usecase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.usecase.exception.LoginException;
import com.usecase.exception.RegistrationException;
import com.usecase.exception.UserDoesNotExists;
import com.usecase.exception.UsernameAlreadyExists;
import com.usecase.model.Hotel;
import com.usecase.model.User;
import com.usecase.service.HotelService;

public class HotelController {
	@Autowired
	HotelService hotelService;

	@PostMapping("addhotel")
	public Hotel addhotel(@RequestBody Hotel hotel) throws RegistrationException {

		if (hotel.getName() == null || hotel.getAddress().length() <= 0 || hotel.getRooms()<=0) {

			throw new RegistrationException("name, address and number of rooms is required");

		} else {

			return hotelService.create(hotel);

		}
	}
}
