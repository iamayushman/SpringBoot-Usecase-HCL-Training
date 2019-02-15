package com.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.usecase.dao.HotelDao;
import com.usecase.model.Hotel;

public class HotelServiceImpl implements HotelService{
	@Autowired
	HotelDao hotelDao;

	@Override
	public Hotel create(Hotel hotel) {
		return hotelDao.save(hotel);
	}

}
