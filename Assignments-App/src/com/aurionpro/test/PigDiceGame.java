package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {

	public static void main(String args[]) {
		System.out.println("Let's Play PIG !");
		System.out.println(
				"* See how many turns it takes you to get to 20.\r\n" + "* Turn ends when you hold or roll a 1.\r\n"
						+ "* If you roll a 1, you lose all points for the turn.\r\n"
						+ "* If you hold, you save all points for the turn.");
		int turnScore = 0, totalScore = 0, turn = 1;
		System.out.println("Turn " + turn);
		
		Scanner sc = new Scanner(System.in);
		Random randN = new Random();
		while (totalScore < 20) {
			System.out.println("Roll or Hold?(r/h)");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("r")) {
				int randomNum = randN.nextInt(6) + 1;
				System.out.println("Die :" + randomNum);
				if (randomNum == 1) {
					System.out.println("Turn over. No Score ");
					turnScore = totalScore;
					turn += 1;
					System.out.println("Turn " + turn);
				} else {
					turnScore += randomNum;
					totalScore += turnScore;
					if (turnScore >= 20) {
						System.out.println("Score for turn " + turnScore);
						System.out.println("Total Score " + totalScore);
						System.out.println("You have finished in " + turn + " turns");
						System.out.println("Game Over!");
					} else {
						System.out.println("Score for turn " + turnScore);
						System.out.println("Total Score " + totalScore);
						

					}
				}

			} else if (input.equalsIgnoreCase("h")) {
				totalScore = turnScore;
				System.out.println("Turn Score " + turnScore);
				System.out.println("Total Score " + totalScore);
				turn += 1;
				System.out.println("Turn " + turn);

			}

		}
		sc.close();
	}
}