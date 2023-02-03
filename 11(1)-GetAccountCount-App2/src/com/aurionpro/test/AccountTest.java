package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(" ", "Sankalp", 2000);
		Account acc1 = new Account("", "Sameer");
		Account acc2 = new Account("");
		Account acc3 = new Account();

	System.out.println(acc);
	System.out.println(acc1);
	System.out.println(acc2);
	System.out.println(acc3);
	

	}
}
