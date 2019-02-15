package com.usecase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.service.TransactionService;

@RestController
public class TransactionController{

	@Autowired
	TransactionService transactionService;

	
}
