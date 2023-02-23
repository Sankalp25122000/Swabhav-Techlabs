package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintNames {

	public static void main(String[] args) {
		List<String> studentList = Arrays.asList("Jay", "Nimesh", "Mahesh", "Ramesh", "Sukesh", "Sankalp");
		List<String> sortByName = studentList.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println("First 3 student in ascending order" + sortByName);

		List<String> sortByName2 = studentList.stream().filter(n -> n.contains("a")).sorted().limit(3)
				.collect(Collectors.toList());
		System.out.println("First 3 names containing a" + sortByName2);

		List<String> sortByName3 = studentList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reversed ordered" + sortByName3);

		List<String> sortByName5 = studentList.stream().filter(n -> n.length() <= 4).collect(Collectors.toList());
		System.out.println("Names of students less than 4 of equal characters " + sortByName5);
	}

}
