package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account ac = new Account(1234, "Sankalp", 4000);
		Account ac1 = new Account();
		Account ac2 = new Account(6754, "Git");

		// ac.deposit(2000);
		ac.withdraw(2000);
		printAccountDetails(ac);

	}

	private static void printAccountDetails(Account ac) {
		System.out.println("AccountNumber " + ac.getAccountNumber());
		System.out.println("Name " + ac.getName());
		System.out.println("Balance " + ac.getBalance());

	}

}
