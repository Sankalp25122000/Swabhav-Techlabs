package com.aurionpro.model;

public class Circle extends Shape {
	
	private double  radius;

	public Circle(Color color,double radius) {
		super(color);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}
