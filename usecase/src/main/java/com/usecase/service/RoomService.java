package com.usecase.service;

import java.util.List;

import javax.validation.Valid;

import com.usecase.model.Hotel;
import com.usecase.model.Room;

public interface RoomService {

	public Room save(Room room);

	public List<Room> findAll();

	public Room findOneById(int id);

}
