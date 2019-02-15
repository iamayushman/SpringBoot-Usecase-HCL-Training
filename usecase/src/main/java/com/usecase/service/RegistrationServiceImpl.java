package com.usecase.service;

import java.util.Set;
import java.util.TreeSet;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.usecase.dao.RegistrationDao;
import com.usecase.model.Role;
import com.usecase.model.User;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationDao registrationDao;

	@Override
	public User create(User user) throws DataIntegrityViolationException {
		return registrationDao.save(user);
	}

}
