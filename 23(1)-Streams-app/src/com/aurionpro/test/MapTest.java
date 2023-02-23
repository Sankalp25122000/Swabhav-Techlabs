 package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class MapTest {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 33, 34, 23);
		List<Integer> collect = numberList.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(collect);
		List<String> players = Arrays.asList("Sukesh", "Mukesh", "Dinesh");
		List<String> collect2 = players.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Account> accountList = Arrays.asList(
				new Account(1,"Sankalp",20000),
				new Account(2,"Sameer",10000),
				new Account(3,"Tejas", 5000),
				new Account(4,"Prem",29000),
				new Account(5,"Ratan",7000),
				new Account(6,"Gitesh", 21000)
				);
	accountList = accountList.stream().map(n ->
		new Account(n.getAccountNumber(),n.getName(),n.getBalance()*1.06)).collect(Collectors.toList());
		System.out.println(accountList);
		
		List<Account> accountList2 = accountList.stream().filter(n -> n.getAccountNumber()==1).collect(Collectors.toList());
		System.out.println(accountList2);
		
		System.out.println();
		List<Integer> collect4 = numberList.stream().filter(n ->n%2==0).map(n->n*n).collect(Collectors.toList());
		System.out.println(collect4);
	}

}
