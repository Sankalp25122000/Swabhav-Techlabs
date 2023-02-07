package com.aurionpro.model;

public class Salesman extends Employee {
	private double bonus;

	public Salesman(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		bonus = basicSalary * 0.30;
		// TODO Auto-generated constructor stub
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Salesman [bonus=" + bonus + "]";
	}

	@Override
	public double calculateAnnualCTC() {
		return (getBasicSalary() + bonus) * 12;
	}

}
