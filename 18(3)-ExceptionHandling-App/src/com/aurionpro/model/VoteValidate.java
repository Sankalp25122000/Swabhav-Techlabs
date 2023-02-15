package com.aurionpro.model;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class VoteValidate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		validateUserAge(age);

	}

	private static void validateUserAge(int age) {
		if (age >= 18) {
			System.out.println("Eligible for voting");

		} else
			throw new RuntimeException("Under age..");

	}

}
