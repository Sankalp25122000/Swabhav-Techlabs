package com.aurionpro.test;

import com.aurionpro.circle.Circle;

public class Radius {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 10;
		convertRadiusByValue(circle.radius);  // By Value
		System.out.println(circle.radius);
		convertRadiusToZero(circle); // By Reference
		System.out.println(circle.radius);
	}

	private static void convertRadiusByValue(double radius) {
		radius = 0;

	}

	public static void convertRadiusToZero(Circle cir) {
		cir.radius = 0;
	}

}
