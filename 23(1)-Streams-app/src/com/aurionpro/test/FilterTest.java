package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 33, 34, 23);
		System.out.println(numberList);

//		List<Integer> divisibleByTen = new ArrayList<Integer>();
//		for (Integer x : numberList) {
//			if (x % 10 == 0) {
//				divisibleByTen.add(x);
//			}
//		}
//		System.out.println(divisibleByTen);
		List<Integer> collect = numberList.stream().filter(n -> n % 10 == 0).collect(Collectors.toList());
		System.out.println(collect);

		List<String> friends = Arrays.asList("Sankalp", "Sukesh", "Jayesh", "Dinesh", "Sana");
		List<String> collect2 = friends.stream().filter(n -> n.length() >= 5).collect(Collectors.toList());
		System.out.println(collect2);

	}
}