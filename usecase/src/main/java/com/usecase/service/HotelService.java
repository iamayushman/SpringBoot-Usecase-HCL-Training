package com.usecase.service;

import java.util.List;

import com.usecase.model.Hotel;

public interface HotelService {

	public Hotel create(Hotel hotel);

	public Hotel findOneById(int id);

	public List<Hotel> findAll();

	public boolean delete(int id);

	public Hotel update(Hotel hotel);

}
