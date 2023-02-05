package com.aurionpro.model;

public class Parent {
	public Parent() {
		System.out.println("Inside Parent Constructor...");
	}

	public Parent(String msg) {
		System.out.println("Inside Parent Constructor..." + msg);
	}

	static {
		System.out.println("Inside parent static block");
	}

}
