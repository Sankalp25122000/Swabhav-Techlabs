package com.aurionpro.model;

public class Rectangle extends Shape {
	private double height;
	private double width;

	public Rectangle(Color color,double height,double width) {
		super(color);
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

}
