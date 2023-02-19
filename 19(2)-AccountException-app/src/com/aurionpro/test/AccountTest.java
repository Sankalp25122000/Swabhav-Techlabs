package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientFundsException;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(1234, "Sankalp", 3000);
		try {
			account.withdraw(1000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		account.getAccountNumber();
		account.getName();
		account.getBalance();

	}

}
