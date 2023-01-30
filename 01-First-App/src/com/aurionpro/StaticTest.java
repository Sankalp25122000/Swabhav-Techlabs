package com.aurionpro;

public class StaticTest {

	public static void main(String[] args) {
		int localVariable = 3;
		printLocalVariable(localVariable);

	}

	private static void printLocalVariable(int var) {
		System.out.println(var);
	}

}
