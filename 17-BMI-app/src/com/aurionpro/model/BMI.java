package com.aurionpro.model;

public class BMI {

	private Person person;
	private double bmi;

	public BMI(Person person) {
		super();
		this.person = person;
		bmi = calculateBMI();
	}

	private double calculateBMI() {
		return  person.getWeight() / (person.getHeight() * person.getHeight());

	}
	public double getBMI() {
		return bmi;
	}
	public String getBodyType() {
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi >= 18.5 && bmi < 25)
			return"Helthy weight";
		else if (bmi >= 25 && bmi <= 29.9)
			return "Overweight";
		else
			return "Obese";

	}

}
