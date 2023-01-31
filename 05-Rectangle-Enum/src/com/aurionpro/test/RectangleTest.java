package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		// System.out.println(rectangle.height); not visible because it is declared
		// private
		// System.out.println(rectangle.width);

		rectangle.setHeight(1000);
		rectangle.setWidth(-201);
		rectangle.setColor(Color.black);
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getColor());

	}
}
