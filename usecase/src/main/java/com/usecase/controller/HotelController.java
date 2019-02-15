package com.usecase.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.usecase.model.Hotel;
import com.usecase.service.HotelService;

public class HotelController {
	@Autowired
	HotelService hotelService;

	@PostMapping("hotel")
	public Hotel addhotel(@Valid @RequestBody Hotel hotel) {

		return hotelService.create(hotel);

	}
}
