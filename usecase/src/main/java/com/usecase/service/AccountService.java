package com.usecase.service;

import java.util.List;

import com.usecase.model.Account;

public interface AccountService {

	List<Account> findAll();

	Account save(Account account);

	Account findOneByNumber(long number);

}
