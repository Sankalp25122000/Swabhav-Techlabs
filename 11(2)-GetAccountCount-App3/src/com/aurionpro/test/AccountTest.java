package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(1234, "Sankalp", 2000);
		Account acc1 = new Account(2345, "Sameer");
		Account acc2 = new Account(3456);
		
		int con = Account.getAccountCount();
		System.out.println("Count of Objects is "+con);

	}
}
