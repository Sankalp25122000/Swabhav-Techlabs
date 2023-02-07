package com.aurionpro.model;

public class CurrentAccount extends Account {
	private final int Over_Draft_Limit = -20000;

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int accountNumber, String name) {
		super(accountNumber, name);
		// TODO Auto-generated constructor stub
	}
    @Override
	public void withdraw(double amount) {
		if (balance - amount > Over_Draft_Limit) {
			balance -= amount;
		}
	}

}
