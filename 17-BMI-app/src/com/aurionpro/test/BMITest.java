package com.aurionpro.test;

import com.aurionpro.model.BMI;
import com.aurionpro.model.Person;

public class BMITest {

	public static void main(String[] args) {
		Person person = new Person("Sankalp", 22, 1.74, 63.00);
		System.out.println(person);

		BMI bm = new BMI(person);
		System.out.println("Your bmi is " + bm.getBMI());
		System.out.println("Your body type is " + bm.getBodyType());

	}

}
