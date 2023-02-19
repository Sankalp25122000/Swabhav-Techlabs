package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.Account;
import com.aurionpro.model.SortByBalance;
import com.aurionpro.model.SortByName;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		list.add(new Account(1234, "Sankalp", 5000));
		list.add(new Account(2345, "Tejas", 2200));
		list.add(new Account(3456, "Akshay", 9000));
		list.add(new Account(4567, "Amogh", 3000));
		list.add(new Account(5678, "Sameer", 10000));
		Account acc = new Account(6789, "Sir", 200);
		list.add(acc);
		printAccounts(list);
		totalBalance(list);
		highestBalance(list);
		minimumBalance(list);
		//Collections.sort(list);
		System.out.println("Accounts in descending order ");
		printAccounts(list);
		Collections.sort(list,new SortByName());
		//printAccounts(list);
		Collections.sort(list,new SortByBalance());
		printAccounts(list);
		

	}

	private static void minimumBalance(List<Account> list) {
		int index = 0;
		double min = list.get(0).getBalance();
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i).getBalance()) {
				min = list.get(i).getBalance();
				index = i;
			}
		}
		System.out.println("Minimum balance of person is ");
		System.out.println(list.get(index));
		System.out.println();

	}

	private static void highestBalance(List<Account> list) {
		int index = 0;
		double max = list.get(0).getBalance();
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i).getBalance()) {
				max = list.get(i).getBalance();
				index = i;
			}
		}
		System.out.println("Maximum balance of person is ");
		System.out.println(list.get(index));
		System.out.println();

	}

	private static void totalBalance(List<Account> list) {
		double totalBalance = 0;
		for (Account x : list) {
			totalBalance += x.getBalance();
			;
		}
		System.out.println("Total balance of all accounts is " + totalBalance);
		System.out.println();

	}

	private static void printAccounts(List<Account> list) {
		System.out.println("List of all Accounts ");
		for (Account x : list) {
			System.out.println(x);
		}
		System.out.println();

	}

}
