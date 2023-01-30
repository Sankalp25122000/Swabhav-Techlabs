package com.aurionpro.test;

import java.util.Scanner;

public class PrimeNoCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int input = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println("It is Prime Number");
		} else {
			System.out.println("It is not Prime Number");
		}
		sc.close();
	}

}
