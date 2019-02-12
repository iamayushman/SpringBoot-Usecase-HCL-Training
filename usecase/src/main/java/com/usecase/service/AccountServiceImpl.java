/**
 * 
 */
package com.usecase.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.dao.AccountDao;
import com.usecase.model.Account;

/**
 * @author AyushmanS
 *
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao accountDao;

	@Override
	public List<Account> findAll() {
		return (List<Account>) accountDao.findAll();
	}

	@Override
	public Account save(Account account) {
		return accountDao.save(account);
	}

	@Override
	public Account findOneByNumber(long number) {
		return accountDao.findOneByNumber(number);
	}

}
