package com.aurionpro.model;

public class Bus extends Vehicle implements IMovable {

	public Bus(String name) {
		super(name);

	}

	@Override
	public void move() {
		System.out.println(this.getName() + " Bus is moving");

	}

}
