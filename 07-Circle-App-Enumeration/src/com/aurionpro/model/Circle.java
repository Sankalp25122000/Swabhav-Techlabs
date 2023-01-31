package com.aurionpro.model;

public class Circle {
	private double radius;
	private Border border;

	public void setRadius(double radius) {
		this.radius = radius;
		calculateArea();

	}

	public void setBorder(Border border) {
		this.border = border;
	}

	public double calculateArea() {
		double area = radius * radius * Math.PI;
		return area;
	}

	public Border getBorder() {
		return border;
	}

	public double getRadius() {
		return radius;
	}

}
