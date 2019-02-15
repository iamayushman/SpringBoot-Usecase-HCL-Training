package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.model.User;

@Repository
public interface RegistrationDao extends CrudRepository<User, Integer> {
	@Override
	@SuppressWarnings("unchecked")
	public User save(User user);
}
