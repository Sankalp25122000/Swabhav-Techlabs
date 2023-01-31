package com.aurionpro.model;

public class Rectangle {

	private double height;
	private int width;
	private Color color;

	public void setHeight(double ht) {
		height = getCorrectedValue(ht);

	}

	private double getCorrectedValue(double num) {
		if (num < 0)
			return 1;
		if (num > 100)
			return 100;
		return num;
	}

	public void setWidth(int wid) {
		width = getCorrectedValue1(wid); 
	}
	public void setColor(Color color) {
		this.color = color;
	}

	private int getCorrectedValue1(int num1) {
		if (num1 < 0)
			return 1;
		if (num1 > 100)
			return 100;
		return num1;
	}

	

	public double getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	public Color getColor() {
		return color;
	}

	
}
