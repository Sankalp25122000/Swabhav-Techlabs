package com.aurionpro.model;

import java.util.Comparator;
import java.util.Objects;

import com.aurionpro.test.AccountTest;

public class Account {
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
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + accountNumber;
//		long temp;
//		temp = Double.doubleToLongBits(balance);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
		return Objects.hash(accountNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
//		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
		return true;
	}
	
	
	

//	@Override
//	public int compareTo(Account o) {
//		// TODO Auto-generated method stub
//		//return Double.compare(o.getBalance(),this.getBalance() );
//		return name.compareTo(o.name);
//	}
////
//	@Override
//	public int compare(Account o1, Account o2) {
//		// TODO Auto-generated method stub
//		return name.compare
//	}

}
