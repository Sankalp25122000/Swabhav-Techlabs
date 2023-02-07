package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingsAccount saving = new SavingsAccount(1234, "Sankalp", 3000);
		saving.deposit(2000);
		saving.withdraw(2000);
		CurrentAccount current = new CurrentAccount(2345, "Tejas", 3000);
		current.deposit(2000);
		current.withdraw(20000);

		printAccountDetails1(saving);
		printAccountDetails(current);

	}

	private static void printAccountDetails(CurrentAccount current) {
		System.out.println("Current Account");
		System.out.println("Account Number is " + current.getAccountNumber());
		System.out.println("Name is " + current.getName());
		System.out.println("Balance is " + current.getBalance());
		System.out.println();

	}

	private static void printAccountDetails1(SavingsAccount saving) {
		System.out.println("Savings Account");
		System.out.println("Account Number is " + saving.getAccountNumber());
		System.out.println("Name is " + saving.getName());
		System.out.println("Balance is " + saving.getBalance());
		System.out.println();

	}

}
