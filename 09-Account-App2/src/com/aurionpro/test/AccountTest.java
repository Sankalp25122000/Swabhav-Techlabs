package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account ac = new Account(1234, "Sankalp", 4000);
		Account ac1 = new Account();
		Account ac2 = new Account(6754, "Git");

		// ac.deposit(2000);
		withdrawBalance(ac, 2000);
		System.out.println();
		depositBalance(ac, 4000);
		System.out.println();
		printAccountDetails(ac);

	}

	private static void depositBalance(Account acc, int amount) {
		if (acc.deposit(amount)) {
			System.out.println("Amount deposited Successfully");
		System.out.println("Balance " + acc.getBalance());
	}
	else {
		System.out.println("Invalid request ");
	}
	}

	private static void withdrawBalance(Account acc, int amount) {
		if (acc.withdraw(amount)) {
			System.out.println("Amount Withdrawn Succesfully");
			System.out.println("Balance " + acc.getBalance());
		} else {
			System.out.println("Invalid request ");
		}

	}

	private static void printAccountDetails(Account ac) {
		System.out.println("AccountNumber " + ac.getAccountNumber());
		System.out.println("Name " + ac.getName());
		System.out.println("Balance " + ac.getBalance());

	}

}
