package com.aurionpro.model;

public class Cow extends Animal {

	public Cow(String name, boolean isCarnivorous) {
		super(name, isCarnivorous);

	}

	@Override
	public void eat() {
		System.out.println("It eats Vegetation.. ");

	}

	public String toString() {
		return super.toString();
	}

}
