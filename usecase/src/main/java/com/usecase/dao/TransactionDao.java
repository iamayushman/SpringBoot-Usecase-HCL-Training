package com.usecase.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.model.History;

@Repository
public interface TransactionDao extends CrudRepository<History, Integer> {
 
	@Override
	History save(History history);

}
