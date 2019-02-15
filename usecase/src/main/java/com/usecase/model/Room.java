package com.usecase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int acRooms;
	private int nonAcRooms;
	private int availableAcRooms;
	private int availableNonAcRooms;
	private int totalAvailableRooms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAcRooms() {
		return acRooms;
	}

	public void setAcRooms(int acRooms) {
		this.acRooms = acRooms;
	}

	public int getNonAcRooms() {
		return nonAcRooms;
	}

	public void setNonAcRooms(int nonAcRooms) {
		this.nonAcRooms = nonAcRooms;
	}

	public int getAvailableAcRooms() {
		return availableAcRooms;
	}

	public void setAvailableAcRooms(int availableAcRooms) {
		this.availableAcRooms = availableAcRooms;
	}

	public int getAvailableNonAcRooms() {
		return availableNonAcRooms;
	}

	public void setAvailableNonAcRooms(int availableNonAcRooms) {
		this.availableNonAcRooms = availableNonAcRooms;
	}

	public int getTotalAvailableRooms() {
		return totalAvailableRooms;
	}

	public void setTotalAvailableRooms(int totalAvailableRooms) {
		this.totalAvailableRooms = totalAvailableRooms;
	}

}
