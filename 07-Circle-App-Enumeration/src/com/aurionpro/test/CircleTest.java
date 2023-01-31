package com.aurionpro.test;

import com.aurionpro.model.Border;

import com.aurionpro.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(3);
		circle.setBorder(Border.dotted);
		System.out.println(circle.getRadius());
		System.out.println(circle.calculateArea());
		System.out.println(circle.getBorder());

	}

}
