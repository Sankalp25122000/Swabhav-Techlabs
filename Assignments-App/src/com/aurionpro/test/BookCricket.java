package com.aurionpro.test;

import java.util.Scanner;
import java.util.Random;

public class BookCricket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int randomNum;
		int totalScore = 0;
		int totalScore1 = 0;
		int run = 1;
		int total = 0;
		int run2 = 1;
		int total1 = 0;
		int count = 0;
		int count1 = 0;

		System.out.println("Enter 1 to Start a game and 0 for Exit ");
		String input = sc.nextLine();
		if (input.equalsIgnoreCase("1")) {

			System.out.print("Enter Player 1 Name : ");
			String name1 = sc.nextLine();
			System.out.print("Enter Player 2 Name : ");
			String name2 = sc.nextLine();
			System.out.println("Player : " + name1);

			while (run != 0) {
				System.out.println("Enter 1 to Open Book ");

				String input1 = sc.nextLine();
				if (input1.equalsIgnoreCase("1")) {
					randomNum = ran.nextInt(300);
					System.out.println("Page Number is " + randomNum);
					run = randomNum % 7;
					total += run;
					System.out.println("Point : " + run);
					System.out.println("Score : " + total);
					count++;
				}

			}
			totalScore = total;
			System.out.println("Total Score is :" + totalScore);
			System.out.println(name1 + " Takes " + count + " Rounds ");
			System.out.println(name2 + " Needs " + ++totalScore + " Scores In " + count + " Rounds To Win Match ");

			while (count1 != count && run2 != 0 && totalScore >= totalScore1) {
				System.out.println("Player : " + name2);
				System.out.println("Enter 1 to Open Book : ");
				String input2 = sc.nextLine();

				if (input2.equalsIgnoreCase("1")) {
					randomNum = ran.nextInt(300);
					System.out.println("Page Number is " + randomNum);
					run2 = randomNum % 7;
					total1 += run2;
					System.out.println("Point : " + run2);
					System.out.println("Score : " + total1);

				}
				count1++;
				totalScore1 = total1;

				System.out.println("Total Score of " + name2 + " is " + totalScore1);

			}

			if (totalScore > totalScore1) {
				System.out.println(name1 + " Wins the Match ");

			} else if (count1 < count && totalScore == totalScore1) {
				System.out.println(name2 + "Is the winner ");
			}

			else {
				System.out.println(name2 + " Wins the Match");
			}
		}
		sc.close();
	}
}
