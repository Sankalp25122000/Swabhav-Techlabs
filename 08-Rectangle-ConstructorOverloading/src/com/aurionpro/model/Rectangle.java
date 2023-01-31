package com.aurionpro.model;

public class Rectangle {

	private double height;
	private double width;
	private Color color;

	public void setHeight(double height) {
		this.height = height;

	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Rectangle(double height, double width, Color color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}

	public Rectangle(double height, double width) {

		this(height, width, Color.blue);

	}

	public Rectangle() {
		this(5, 8, Color.blue);
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

	public Color getColor() {
		return color;
	}

}
