package com.aurionpro.test;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no for fibonacci series");
		int n = sc.nextInt();
		calcFibonacci(n);
        sc.close();
	}

	private static void calcFibonacci(int n) {
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		int c;
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a=b;
			b=c;

		}
	}

}
