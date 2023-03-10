package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {

		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountNumber, String name) {

		this(accountNumber, name, 1000);
	}

	public Account() {
		this(9876, "sameer", 1000);
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean deposit(double amount) {
		if (balance > 0) {
			balance += amount;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amount) {
		if (balance - amount > 1000) {
			balance -= amount;
			return true;
		}
		return false;
	}

}
