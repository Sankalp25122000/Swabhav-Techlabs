package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		// rectangle.setHeight(5);
		// rectangle.setWidth(8);
		Rectangle rectangle1 = new Rectangle(20, 30);
		Rectangle rectangle2 = new Rectangle();
		printDetailsOfRectangle(rectangle);
		printDetailsOfRectangle(rectangle1);
		printDetailsOfRectangle(rectangle2);

	}

	private static void printDetailsOfRectangle(Rectangle rectangle) {
		System.out.println("Height " + rectangle.getHeight());
		System.out.println("width " + rectangle.getWidth());
		System.out.println("Color " + rectangle.getColor());
		System.out.println("Area " + rectangle.calcArea());

	}
}
