package com.aurionpro.model;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	private static int count;
	private static int i=0;

	public Account(String accountNumber, String name, double balance) {

		
		this.name = name;
		this.balance = balance;
		count++;
		i++;
		this.accountNumber = "S00"+i;
		
	}

	public Account(String accountNumber, String name) {

		this(accountNumber, name, 1000);

	}

	public Account(String accountNumber) {
		this(accountNumber, "unknown", 1000);

	}
	public Account() {
		this("s001","Sam",1000);
	}

	public void setAccountNumber(String accountNumber) {
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

	public String getAccountNumber() {
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

	public static int getAccountCount() {

		return count;

	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
