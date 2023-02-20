package com.aurionpro.model;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		// TreeSet arranges all values in ascending order also poll method used to
		// remove elements
//		System.out.println("Lowest Value: " + set.pollFirst());
//		System.out.println("Highest Value: " + set.pollLast());
		System.out.println("Set Value: " + set);
		System.out.println("Reverse Set: " + set.descendingSet());

		

	}

}
