package com.aurionpro.model;

public class Accountant extends Employee {
	private double performanceAllowance;

	public Accountant(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		performanceAllowance = basicSalary * 0.15;
		// TODO Auto-generated constructor stub
	}

	public double getPerformanceAllowance() {
		return performanceAllowance;
	}

	public void setPerformanceAllowance(double performanceAllowance) {
		this.performanceAllowance = performanceAllowance;
	}

	@Override
	public String toString() {
		return "Accountant [performanceAllowance=" + performanceAllowance + "]";
	}

	@Override
	public double calculateAnnualCTC() {
		// TODO Auto-generated method stub
		return (getBasicSalary() + (performanceAllowance)) * 12;
	}

}
