package com.aurionpro.model;

public class SavingsAccount extends Account {
	public SavingsAccount(int accountNumber, String name) {
		super(accountNumber, name);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
	}

	private final int Min_Balance = 1000;

	@Override
	public void withdraw(double amount) {
		if (balance - amount > Min_Balance) {
			balance -= amount;
		}

	}

}
