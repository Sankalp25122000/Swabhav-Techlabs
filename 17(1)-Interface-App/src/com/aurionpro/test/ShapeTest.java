package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,20);
		System.out.println("Area of rectangle is "+rect.calculateArea());
		rect.showColor();
	}

}
