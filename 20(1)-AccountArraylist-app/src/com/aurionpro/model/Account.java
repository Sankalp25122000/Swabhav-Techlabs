package com.aurionpro.model;

import java.util.Comparator;

import com.aurionpro.test.AccountTest;

public class Account implements Comparable<Account>{
	private int accountNumber;
	private String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
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

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		//return Double.compare(o.getBalance(),this.getBalance() );
		return name.compareTo(o.name);
	}
//
//	@Override
//	public int compare(Account o1, Account o2) {
//		// TODO Auto-generated method stub
//		return name.compare
//	}

}
