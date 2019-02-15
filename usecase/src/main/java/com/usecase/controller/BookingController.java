package com.usecase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.model.Booking;
import com.usecase.service.BookingServiceImpl;
import com.usecase.service.HotelService;

@RestController
public class BookingController {

	@Autowired
	BookingServiceImpl bookingService;
	
	@PostMapping("/booking")
	public Booking booking(@RequestBody Booking bookRoom) {
	
		return bookingService.create(bookRoom);
		
	}
}
