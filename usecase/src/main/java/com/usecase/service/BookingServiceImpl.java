package com.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.usecase.dao.BookingDao;
import com.usecase.model.Booking;

public class BookingServiceImpl implements BookingService{

	@Autowired
	BookingDao dao;
	
	@Override
	public Booking create(Booking bookRoom) {
		return dao.save(bookRoom);
	}
}