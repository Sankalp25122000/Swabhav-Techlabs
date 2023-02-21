package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accountList = Arrays.asList(
				new Account(1,"Sankalp",20000),
				new Account(2,"Sameer",10000),
				new Account(3,"Tejas", 5000),
				new Account(4,"Prem",29000),
				new Account(5,"Ratan",7000),
				new Account(6,"Gitesh", 21000)
				);
		System.out.println(accountList);
		List<Account> balanceMoreThan10k = accountList.stream().filter(n -> n.getBalance()>=10000).collect(Collectors.toList());
		System.out.println(balanceMoreThan10k);
				

	}

}
