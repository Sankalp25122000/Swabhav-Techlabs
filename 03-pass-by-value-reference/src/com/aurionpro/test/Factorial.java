package com.aurionpro.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. to find it's Factorial");
		int input = sc.nextInt();
		countFactorial(input);
		sc.close();
	}

	private static void countFactorial(int n) {
		int output = 1;
		for (int i = 1; i <= n; i++) {
			output = output * i;
		}
		System.out.println("Factorial of " + n + " is " + output);

	}

}
