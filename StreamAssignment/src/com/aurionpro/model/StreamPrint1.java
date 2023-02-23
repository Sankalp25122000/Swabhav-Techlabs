package com.aurionpro.model;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Stream;

public class StreamPrint1 {

	public static void main(String[] args) {
		String[] names = { "Jayesh", "Nimesh", "Mahesh", "Ramesh" };
		System.out.println("With for each loop");
		for (String x : names) {
			System.out.println(x);
		}
		Stream<String> nameList = Stream.of("Jayesh", "Nimesh", "Mahesh", "Ramesh");
		System.out.println("\nUsing stream.forEach");
		nameList.forEach(System.out::println);

		List<String> nameList2 = Arrays.asList("Jayesh", "Nimesh", "Mahesh", "Ramesh");
		System.out.println("\nUsing Arrays.asList forEach");
		nameList2.forEach(System.out::println);

		System.out.println("\nUsing static method reference");
		IPrintArr names2 = StreamPrint1::printArr;
		names2.printArr(names);

	}

	public static void printArr(String[] arr) {
		for (String x : arr) {
			System.out.println(x);
		}
	}

}
