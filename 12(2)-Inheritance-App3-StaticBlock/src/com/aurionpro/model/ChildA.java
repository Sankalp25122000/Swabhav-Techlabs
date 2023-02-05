package com.aurionpro.model;

public class ChildA extends Parent {
	public ChildA() {
		super("Hello");
		System.out.println("Inside ChildA class...");
	}

	static {
		System.out.println("Inside childA class static block ");
	}

}
