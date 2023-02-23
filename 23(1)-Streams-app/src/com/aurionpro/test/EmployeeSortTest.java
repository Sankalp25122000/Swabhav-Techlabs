package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeSortTest {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Ratan", 20000, "Sales"),
				new Employee(2, "Salman", 30000, "Management"), new Employee(3, "Shahrukh", 40000, "Advertising"),
				new Employee(4, "Akshay", 2000, "Accounts"));

//		List<Integer> sortBySalary = employees.stream().map(n -> new Employee(n.getId(),n.getName(),n.getSalary(),n.getDepartment()).sorted().collect(Collectors.toList());
//        System.out.println(sortBySalary);
//        List<String> sortByDept = employees.stream().map(n -> n.getDepartment()).sorted().collect(Collectors.toList());
//        System.out.println(sortByDept);

		List<Employee> sortBySalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(sortBySalary);
		List<Employee> sortByDepartment = employees.stream()
				.sorted(Comparator.comparing(Employee::getDepartment).reversed()).collect(Collectors.toList());
		System.out.println(sortByDepartment);
	}

}
