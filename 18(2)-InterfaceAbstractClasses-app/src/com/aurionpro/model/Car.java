package com.aurionpro.model;

public class Car extends Vehicle implements IMovable {

	public Car(String name) {
		super(name);

	}

	@Override
	public void move() {
		System.out.println(this.getName() + " Car is moving");

	}

}
