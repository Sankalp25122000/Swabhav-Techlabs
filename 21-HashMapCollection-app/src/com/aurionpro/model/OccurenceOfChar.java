package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfChar {

	public static void main(String[] args) {
		Map<Character, Integer> countChar = new HashMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name to see each character occurence ");
		String input = sc.nextLine();
//		input.toLowerCase();
//		char[] strArray = input.toCharArray();
		for (Character c : input.toLowerCase().toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				if (countChar.containsKey(c)) {

					countChar.put(c, countChar.get(c) + 1);
				} else
					countChar.put(c, 1);
			}
		}

		countChar.forEach((key, value) -> System.out.println(key + " : " + value)); // for iterating all elements in map
//		for (Character x : countChar.keySet()) {
//			System.out.println(x + " : " + countChar.get(x));
//		}

	}
}
