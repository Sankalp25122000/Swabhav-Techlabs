package com.aurionpro.test;

import java.util.Scanner;

public class CovertNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Covert in Hexadecimal, Octal and Binary ");
		int input = sc.nextInt();
		System.out.println("Binary " + Integer.toBinaryString(input));
		System.out.println("Octal " + Integer.toOctalString(input));
		System.out.println("Hexadecimal " + Integer.toHexString(input));
		sc.close();

	}

}
