package com.aurionpro.model;

public class Boy extends Man {
	
	public void read() {
		System.out.println("Boy reads..");
	}

	@Override
	public void eats() {
		System.out.println("Boy eats..");
	}
    @Override
	public void play() {
		System.out.println("Boy plays..");
	}

}
