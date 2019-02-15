package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.model.Booking;

@Repository
public interface BookingDao extends CrudRepository<Booking, Integer> {

}