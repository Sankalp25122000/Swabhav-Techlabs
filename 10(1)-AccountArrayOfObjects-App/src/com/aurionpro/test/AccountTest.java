package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account accounts[] = new Account[5];
		accounts[0] = new Account(1234, "Sankalp", 5600);
		accounts[1] = new Account(2345, "Tejas", 9000);
		accounts[2] = new Account(3456, "Amogh", 8000);
		accounts[3] = new Account(4567, "Amit", 7000);
		accounts[4] = new Account(8765, "Abhi", 6000);

		for (Account i : accounts) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Highest Balance ");
		double max = accounts[0].getBalance();
		int index = 0;
		for (int i = 0; i < 5; i++) {
			if (max < (accounts[i].getBalance())) {
				max = accounts[i].getBalance();
				index = i;
			}
		}
		System.out.println(accounts[index]);
		System.out.println();
		sortAccounts(accounts);
		for (Account x : accounts) {
			System.out.println(x);
		}

	}

	private static void sortAccounts(Account[] arr) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i - 1; j++) {
				if (arr[j].getBalance() > arr[j + 1].getBalance()) {
					Account temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}
		}

	}
}
