package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String Department;

	public Employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", Department=" + Department + "]";
	}

}
