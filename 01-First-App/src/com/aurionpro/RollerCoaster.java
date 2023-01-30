package com.aurionpro;

import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter your height");
		int height = sc.nextInt();
		if (height > 120) {
			System.out.println("You can ride.");
			System.out.println("Enter your age");
			int age = sc.nextInt();
			if (age < 12) {
				System.out.println("pay $5");
				sum = 5;
			} else if (age >= 12 && age <= 18) {
				System.out.println("pay $7");
				sum = 7;
			} else if (age > 18 && age < 45) {
				System.out.println("pay $12");
				sum = 12;
			} else if (age >= 45 && age <= 55) {
				System.out.println("pay $3");
				sum = 3;
			} else {
				System.out.println("pay $0");
				sum = 0;
			}
		} else {
			System.out.println("You can't ride.");

		}
		System.out.println("Want photos. say yes or no");
		String ans = sc.next();
		if (ans.equalsIgnoreCase("yes")) {
			System.out.println("pay $3");
			sum += 3;
		}

		System.out.println("Your total bill is $" + sum);
		sc.close();
	}

}
