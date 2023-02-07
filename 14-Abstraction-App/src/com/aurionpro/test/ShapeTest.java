package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Circle cir = new Circle(Color.blue,2);
		System.out.println("Circle color is "+cir.getColor());
		System.out.println("Circle area is "+cir.calculateArea());
		Rectangle rect = new Rectangle(Color.red,2,4);
		System.out.println("Rectangle color is "+rect.getColor());
		System.out.println("Rectangle area is "+rect.calculateArea());
		
		

	}

}
