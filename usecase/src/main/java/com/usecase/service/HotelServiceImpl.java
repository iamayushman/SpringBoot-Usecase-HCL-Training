package com.usecase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.usecase.dao.HotelDao;
import com.usecase.model.Hotel;

public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelDao hotelDao;

	@Override
	public Hotel create(Hotel hotel) {
		return hotelDao.save(hotel);
	}

	@Override
	public List<Hotel> findAll() {
		return (List<Hotel>) hotelDao.findAll();
	}

	@Override
	public Hotel findOneById(int id) {
		return hotelDao.findOneById(id);
	}

}
