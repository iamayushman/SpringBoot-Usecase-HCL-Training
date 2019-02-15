package com.usecase.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.model.Hotel;
import com.usecase.model.Room;

@Repository
public interface RoomDao extends CrudRepository<Room, Integer> {
	public Room save(Room room);

	public List<Room> findAll();

	public Room findOneById(int id);
}
