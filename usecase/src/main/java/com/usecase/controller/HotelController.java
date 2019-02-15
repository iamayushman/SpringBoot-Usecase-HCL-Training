package com.usecase.controller;

import javax.validation.Valid;

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
	public Hotel addhotel(@Valid @RequestBody Hotel hotel) throws RegistrationException {

		return hotelService.create(hotel);

	}
}
