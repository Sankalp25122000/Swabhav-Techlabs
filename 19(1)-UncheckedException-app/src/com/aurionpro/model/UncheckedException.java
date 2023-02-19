package com.aurionpro.model;

public class UncheckedException {

	public static void main(String[] args) {
		method1();
		System.out.println("main");

	}

	private static void method1() {
		method2();
		System.out.println("method1");

	}

	private static void method2() {
		method3();
		System.out.println("method2");

	}

	private static void method3() {
		throw new RuntimeException("Exception Occured..");

	}

}
