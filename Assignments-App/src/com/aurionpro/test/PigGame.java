package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class PigGame {

	public static void main(String[] args) {
		System.out.println(
				"* See how many turns it takes you to get to 20.\r\n" + "* Turn ends when you hold or roll a 1.\r\n"
						+ "* If you roll a 1, you lose all points for the turn.\r\n"
						+ "* If you hold, you save all points for the turn.");
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int randNo = 0;

		int turnScore = 0;
		int totalScore = 0;

		do {

			while (randNo != 1) {
				System.out.println("Roll or Hold?(r/h)");
				String input = sc.next();
				if (input.equalsIgnoreCase("r")) {
					randNo = ran.nextInt(6) + 1;
					turnScore += randNo;

					System.out.println("Die " + randNo);

				} else if (input.equalsIgnoreCase("h")) {
					System.out.println("Score for Turn is " + turnScore);

				}

			}

		} while (totalScore < 21);
		totalScore += turnScore;
		System.out.println("Total Score is " + totalScore);
	}
}
