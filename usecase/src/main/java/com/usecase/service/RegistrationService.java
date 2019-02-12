package com.usecase.service;
 
import org.springframework.dao.DataIntegrityViolationException; 

import com.usecase.model.User;

public interface RegistrationService {
	public User create(User user) throws DataIntegrityViolationException;
}
