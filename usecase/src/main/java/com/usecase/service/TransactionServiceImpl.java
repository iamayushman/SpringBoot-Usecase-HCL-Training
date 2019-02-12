package com.usecase.service;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.usecase.dao.TransactionDao;
import com.usecase.model.History;
import com.usecase.model.Role;
import com.usecase.model.User;

public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactionDao;

	@Override
	public History create(History history) {
		return transactionDao.save(history);
	}
}
