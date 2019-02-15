package com.usecase.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.exception.RegistrationException;
import com.usecase.exception.UsernameAlreadyExists;
import com.usecase.model.User;
import com.usecase.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@PostMapping("register")
	public User create(@Valid @RequestBody User user) throws RegistrationException, UsernameAlreadyExists {

		if (user.getUsername() == null || user.getUsername().length() <= 0 || user.getPassword() == null
				|| user.getPassword().length() <= 0) {

			throw new RegistrationException("Username and password is required");

		} else {
			try {

				return registrationService.create(user);

			} catch (DataIntegrityViolationException e) {

				throw new UsernameAlreadyExists();

			}

		}
	}

}
