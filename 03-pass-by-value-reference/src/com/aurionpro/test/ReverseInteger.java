package com.aurionpro.test;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number to reverse it ");
		int num = sc.nextInt();
		reverseNum(num);
		sc.close();
	}

	private static void reverseNum(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse Number is " + reverse);
	}

}
