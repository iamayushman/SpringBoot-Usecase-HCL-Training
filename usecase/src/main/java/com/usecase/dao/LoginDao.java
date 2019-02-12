package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.model.User;

@Repository
public interface LoginDao extends CrudRepository<User, Integer> {

	public User findOneByUsernameAndPassword(String username, String password);

	public User findOneById(int id);
}
