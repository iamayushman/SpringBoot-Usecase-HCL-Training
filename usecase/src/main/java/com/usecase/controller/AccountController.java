package com.usecase.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.model.Account;
import com.usecase.service.AccountService;

@RestController
@RequestMapping(path = "admin")
public class AccountController {

	@Autowired
	AccountService accountService;

	@GetMapping("accounts")
	public List<Account> viewAccounts(Account account) {
		return accountService.findAll();
	}

	@GetMapping("account/{number}")
	public Account viewAccount(@PathVariable("number") Long number) {
		return accountService.findOneByNumber(number);
	}

	@PostMapping("account")
	public Account createAccount(@Valid Account account) {
		return accountService.save(account);
	}

	@PostMapping("open-account")
	public Account openAccount(Account account) {
		return accountService.save(account);
	}

}
