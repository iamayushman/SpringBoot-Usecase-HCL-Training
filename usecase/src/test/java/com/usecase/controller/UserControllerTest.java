package com.usecase.controller;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;
import com.usecase.exception.UserDoesNotExists;
import com.usecase.model.User;

public class UserControllerTest {

	

	

	@Test(expected=UserDoesNotExists.class)
	
	public void testCreate(User user) {
		
		assertNotNull(user);
		assertNotNull(user.getUsername());
		assertNotNull(user.getPassword());
	}

	@Test(expected=NoSuchElementException.class)
	public void testViewAccount(User user) {
		
		assertNotNull(user);
		
	}

}
