package com.aurionpro.model;

public class Rectangle {

	private double height;
	private double width;

	public void setHeight(double height) {
		this.height = height;

	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Rectangle(double height, double width) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		height = 5;
		width = 10;
	}

	public double calcArea() {
		return height * width;

	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

}
