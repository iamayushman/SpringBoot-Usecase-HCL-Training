package com.usecase.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usecase.exception.LoginException;
import com.usecase.model.User;

public class UserControllerTest {

	

	

	@Test
	public void testCreate(User user) {
		
		assertNotNull(user);
		assertNotNull(user.getUsername());
		assertNotNull(user.getPassword());
	}

	@Test
	public void testViewAccount(User user) {
		assertNotNull(user);
	}

}
