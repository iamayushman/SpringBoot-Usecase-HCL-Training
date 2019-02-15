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
	private int ac;
	private int nonAc;
	private int availableAcRoom;
	private int availableNonAcRoom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getNonAc() {
		return nonAc;
	}

	public void setNonAc(int nonAc) {
		this.nonAc = nonAc;
	}

	public int getAvailableAcRoom() {
		return availableAcRoom;
	}

	public void setAvailableAcRoom(int availableAcRoom) {
		this.availableAcRoom = availableAcRoom;
	}

	public int getAvailableNonAcRoom() {
		return availableNonAcRoom;
	}

	public void setAvailableNonAcRoom(int availableNonAcRoom) {
		this.availableNonAcRoom = availableNonAcRoom;
	}

}
