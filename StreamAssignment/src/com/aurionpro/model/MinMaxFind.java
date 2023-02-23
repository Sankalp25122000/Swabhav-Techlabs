package com.aurionpro.model;

import java.util.Arrays;

import java.util.List;

public class MinMaxFind {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 25, 35, 45);
		numbers.stream().mapToInt(v -> v).max().ifPresent(System.out::println);
		numbers.stream().mapToInt(v -> v).min().ifPresent(System.out::println);

	}

}
