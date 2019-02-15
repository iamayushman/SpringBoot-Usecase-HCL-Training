package com.usecase.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.dao.HotelDao;
import com.usecase.dao.RoomDao;
import com.usecase.model.Hotel;
import com.usecase.model.Room;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
	@Autowired
	RoomDao roomDao;

	@Override
	public Room save(Room room) {

		return roomDao.save(room);
	}

	@Override
	public List<Room> findAll() {

		return roomDao.findAll();
	}

	@Override
	public Room findOneById(int id) {

		return roomDao.findOneById(id);
	}

}
