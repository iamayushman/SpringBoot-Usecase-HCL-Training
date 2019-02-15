package com.usecase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.exception.LoginException;
import com.usecase.exception.UserDoesNotExists;
import com.usecase.model.User;
import com.usecase.service.LoginService;

@RestController
public class UserController {

	@Autowired
	LoginService loginService;

	@PostMapping("login")
	public User create(@RequestBody User user) throws LoginException, UserDoesNotExists {

		if (user.getUsername() == null || user.getUsername().length() <= 0 || user.getPassword() == null
				|| user.getPassword().length() <= 0) {

			throw new LoginException("Username and password is required");

		} else {

			return loginService.validate(user);

		}
	}

	@GetMapping("admin/users/{id}")
	public User viewAccount(@PathVariable("id") int id) {
		return loginService.findOneById(id);
	}

}
