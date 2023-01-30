package com.aurionpro.test;

public class Overloading {

	public static void main(String[] args) {
		printInfo(1);
		printInfo(1, 2, 3);
		printInfo("Mahim");
		printInfo(10.00f);
		printInfo(10.00);
	}

	private static void printInfo(double d) {
		System.out.println(d);
	}

	private static void printInfo(float f) {
		System.out.println(f);
	}

	private static void printInfo(String string) {
		System.out.println(string);
	}

	private static void printInfo(int i, int j, int k) {
		System.out.println(i + " " + j + " " + k);
	}

	private static void printInfo(int i) {
		System.out.println(i);
	}

}
