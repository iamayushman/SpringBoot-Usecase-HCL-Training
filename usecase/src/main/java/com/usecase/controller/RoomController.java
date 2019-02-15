package com.usecase.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.model.Hotel;
import com.usecase.model.Room;
import com.usecase.service.HotelService;
import com.usecase.service.RoomService;

@RestController
public class RoomController {
	@Autowired
	RoomService roomService;
	@Autowired
	HotelService hotelService;

	@PostMapping("hotel/{id}/rooms")
	public Room addHotel(@Valid @RequestBody Room room, @PathVariable int id) {
		room.setHotel(hotelService.findOneById(id));
		return roomService.save(room);
	}

	@GetMapping("hotel/{id}/rooms")
	public List<Room> getHotels() {
		return (List<Room>) roomService.findAll();
	}

	@GetMapping("hotel/{id}/room")
	public Room getHotel(@PathVariable int id) {
		return roomService.findOneById(id);
	}

}