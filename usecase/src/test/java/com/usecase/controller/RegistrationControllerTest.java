package com.usecase.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usecase.model.User;

public class RegistrationControllerTest {

	@Test
	public void testCreate(User user) {
		assertNotNull(user);
		assertNotNull(user.getUsername());
		assertNotNull(user.getPassword());
	}

}
