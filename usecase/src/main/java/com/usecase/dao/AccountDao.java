package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.model.Account;

@Repository
public interface AccountDao extends CrudRepository<Account, Integer> {

	Account findOneByNumber(long number);

}
