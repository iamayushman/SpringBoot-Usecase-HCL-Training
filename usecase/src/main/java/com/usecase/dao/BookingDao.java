package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;

import com.usecase.model.Booking;

public interface BookingDao extends CrudRepository<Booking, Integer> {

}
