package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Employee;

public class MinMaxTest {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Ratan", 20000, "Sales"),
				new Employee(2, "Salman", 30000, "Management"), new Employee(3, "Shahrukh", 40000, "Advertising"),
				new Employee(4, "Akshay", 2000, "Accounts"),
				new Employee(4, "lakha", 2000, "Accounts"),
				new Employee(4, "Ajay", 2000, "Accounts")
				);
		
		//employees.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);//returns lowest salary
		//employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);//returns highest salary
		Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
	  //  System.out.println(max);  this will print optional value if printed directly hence
	    if(max.isPresent()) {
	    	System.out.println(max.get());
	    }
	    Optional<Employee> min = employees.stream().min(Comparator.comparing(Employee::getSalary));
	    if(min.isPresent()) {
	    	System.out.println(min.get());
	    }
	 
	}

}
