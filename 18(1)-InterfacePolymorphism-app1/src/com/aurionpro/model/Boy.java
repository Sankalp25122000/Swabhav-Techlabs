package com.aurionpro.model;

public class Boy implements IMannerable {

	@Override
	public void greetOnArrival() {
		System.out.println("Boy is greeting on arrival");

	}

	@Override
	public void greetOnDeparture() {
		System.out.println("Boy is greeting on departure");

	}

}
