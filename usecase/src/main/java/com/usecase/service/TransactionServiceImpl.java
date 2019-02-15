package com.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.usecase.dao.TransactionDao;
import com.usecase.model.History;

public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactionDao;

	@Override
	public History create(History history) {
		return transactionDao.save(history);
	}
}
