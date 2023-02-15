package com.aurionpro.model;

public class Rectangle implements Shape {
	private double height;
	private double width;

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

	@Override
	public double calculateArea() {

		return height * width;
	}

	@Override
	public void showColor() {
		System.out.println("It is in red color");

	}

}
