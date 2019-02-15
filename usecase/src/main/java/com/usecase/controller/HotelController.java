package com.usecase.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.model.Hotel;
import com.usecase.service.HotelService;


@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;

	@PostMapping("hotel")
	public Hotel addHotel(@Valid @RequestBody Hotel hotel) {
		return hotelService.create(hotel);
	}

	@GetMapping("hotels")
	public List<Hotel> getHotels() {
		return (List<Hotel>) hotelService.findAll();
	}

	@GetMapping("hotel/{id}")
	public Hotel getHotel(@PathVariable int id) {
		return hotelService.findOneById(id);
	}

}
