package com.aurionpro.test;

import com.aurionpro.model.IGreetable;

public class GreetingTest {

	public static void main(String[] args) {
		IGreetable ig = (msg) -> System.out.println("Hello " + msg);
		ig.greet("Sankalp");
		IGreetable ig1 = GreetingTest::hi; //method is static hence no need of object creation
		ig1.greet("Sameer");
		GreetingTest test = new GreetingTest();//method is not static so we have to create object first then call it
		IGreetable ig3 = test::welcome;    //method reference
		ig3.greet("Sanskar");

	}

	public static void hi(String msg) {
		System.out.println("Hi " + msg);
	}

	public void welcome(String msg) {
		System.out.println("Welcome " + msg);
	}

}
