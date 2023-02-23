package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10,20,11,34,45,56);
		
		Collections.sort(numList,Collections.reverseOrder());
		List<Integer> sortedList = numList.stream()
				.filter(n -> n%2 == 0)
				.sorted().collect(Collectors.toList());
		System.out.println(numList);
		System.out.println(sortedList);
		
		List<String> nameList = Arrays.asList("Vijay","Ajay","Sujay");
		Collections.sort(nameList,Collections.reverseOrder());
		System.out.println(nameList);
	}

}
