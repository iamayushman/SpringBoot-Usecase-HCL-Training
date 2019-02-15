package com.usecase.service;

import com.usecase.model.User;

public interface LoginService {

	User validate(User user);

	User findOneById(int id); 

}
