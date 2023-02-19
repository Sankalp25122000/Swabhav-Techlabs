package com.aurionpro.model;

import java.util.Scanner;

public class VoteValidate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		try {
			validateUserAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}System.out.println("Program ended ");

	}

	private static void validateUserAge(int age) throws InvalidAgeException {
		if (age >= 18) {
			System.out.println("Eligible for voting");

		} else
			throw new InvalidAgeException("Under age..");

	}

}
