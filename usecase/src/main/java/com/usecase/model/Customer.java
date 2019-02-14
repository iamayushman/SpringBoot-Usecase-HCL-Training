package com.usecase.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
