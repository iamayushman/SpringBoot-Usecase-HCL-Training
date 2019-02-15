package com.usecase.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.dao.BookingDao;
import com.usecase.model.Booking;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao dao;

	@Override
	public Booking create(Booking bookRoom) {
		return dao.save(bookRoom);
	}
}