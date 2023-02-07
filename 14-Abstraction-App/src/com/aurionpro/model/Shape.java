package com.aurionpro.model;

abstract class Shape {
	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}



	public abstract double calculateArea();

	

}
