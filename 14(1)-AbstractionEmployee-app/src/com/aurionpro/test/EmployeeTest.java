package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Salesman;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager man = new Manager(12, "Sudu", 10000);
		Salesman sale = new Salesman(23, "Dudu", 10000);
		Accountant acc = new Accountant(34, "Kudu", 10000);

		printSalaryDetails(man);
		printSalaryDetails(sale);
		printSalaryDetails(acc);

	}

	private static void printSalaryDetails(Accountant acc) {
		System.out.println("Account ");
		System.out.println(acc);
		System.out.println("EmpID = " + acc.getEmployeeId());
		System.out.println("Name = " + acc.getName());
		System.out.println("Salary = " + acc.getBasicSalary());
		System.out.println("CTC = " + acc.calculateAnnualCTC());
		System.out.println();

	}

	private static void printSalaryDetails(Salesman sale) {
		System.out.println("Salesman");
		System.out.println(sale);
		System.out.println("EmpID = " + sale.getEmployeeId());
		System.out.println("Name = " + sale.getName());
		System.out.println("Salary = " + sale.getBasicSalary());
		System.out.println("CTC = " + sale.calculateAnnualCTC());
		System.out.println();

	}

	private static void printSalaryDetails(Manager man) {
		System.out.println("Manager");
		System.out.println(man);
		System.out.println("EmpID = " + man.getEmployeeId());
		System.out.println("Name = " + man.getName());
		System.out.println("Salary = " + man.getBasicSalary());
		System.out.println("CTC = " + man.calculateAnnualCTC());
		System.out.println();

	}

}
