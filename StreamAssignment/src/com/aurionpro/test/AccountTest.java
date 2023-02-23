package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accountList = Arrays.asList(new Account(1, "Sankalp", 20000), new Account(2, "Sameer", 10000),
				new Account(3, "Tejas", 5000), new Account(4, "Prem", 29000), new Account(5, "Ratan", 7000),
				new Account(6, "Gitesh", 21000));
		System.out.println("Account with min salary");
		accountList.stream().min(Comparator.comparing(Account::getBalance)).ifPresent(System.out::println);
		System.out.println("Account with max salary");
		accountList.stream().max(Comparator.comparing(Account::getBalance)).ifPresent(System.out::println);
		System.out.println("Name greater than 6 characters");
		List<Account> collect = accountList.stream().filter(n -> n.getName().length() > 6).collect(Collectors.toList());
		System.out.println(collect);
//		int totalBalance = 0;
//		for (Account x : accountList) {
//			totalBalance += x.getBalance();
//		}
//		System.out.println("Total balance is " + totalBalance);
		Double totalBalance = accountList.stream().collect(Collectors.summingDouble(Account::getBalance));
		System.out.println("Total balance is "+totalBalance);
	}

}
