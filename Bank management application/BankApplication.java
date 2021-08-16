package com.adem;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.adem.dao.AccountRepository;
import com.adem.dao.CustomerRepository;
import com.adem.dao.OperationRepository;
import com.adem.entities.Account;
import com.adem.entities.CurrentAccount;
import com.adem.entities.Customer;
import com.adem.entities.Operation;
import com.adem.entities.PaymentOperation;
import com.adem.entities.SavingsAccount;
import com.adem.entities.WithdrawalOperation;
import com.adem.service.IBankService;

@SuppressWarnings("unused")
@SpringBootApplication 
public class BankApplication  { // implements CommandLineRunner

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private OperationRepository operationRepository;

	@Autowired
	private IBankService iBankService;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BankApplication.class, args);

	}
	

}