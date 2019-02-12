/**
 * 
 */
package com.usecase.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.dao.LoginDao;
import com.usecase.exception.UserDoesNotExists;
import com.usecase.model.Account;
import com.usecase.model.User;

/**
 * @author AyushmanS
 *
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	@Override
	public User validate(User user) {
		User returnUser = null;
		returnUser = loginDao.findOneByUsernameAndPassword(user.getUsername(), user.getPassword());
		if (returnUser == null) {
			throw new UserDoesNotExists();
		}
		returnUser.setToken(getAlphaNumericString(40));
		loginDao.save(returnUser);
		return returnUser;
	}

	static String getAlphaNumericString(int n) {

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	@Override
	public User findOneById(int id) {
		return loginDao.findOneById(id);
	}

}
