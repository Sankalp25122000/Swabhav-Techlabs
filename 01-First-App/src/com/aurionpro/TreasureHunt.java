package com.aurionpro;

import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the treasur hunt choose left of right");
		String option = sc.next();
		if (option.equalsIgnoreCase("left")) {
			System.out.println("Swim of wait");
			 option = sc.next();
			if (option.equalsIgnoreCase("wait")) {
				System.out.println("Choose door between yellow, red, blue");
				option = sc.next();
				if (option.equalsIgnoreCase("yellow")) {
					System.out.println("You win");
				} else if (option.equalsIgnoreCase("red")) {
					System.out.println("Burned by fire. Game over");
				} else if (option.equalsIgnoreCase("blue")) {
					System.out.println("Eaten by beasts. Game over");
				} else {
					System.out.println("Game over");
				}
			} else {
				System.out.println("Attacked by trout. Game over");
			}

		} else {
			System.out.println("Fall into a hole. Game over");
		}
      sc.close();
	}

}
