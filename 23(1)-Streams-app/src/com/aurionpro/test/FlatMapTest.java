package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.aurionpro.model.Student;

public class FlatMapTest {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2, 3, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 6);
		List<Integer> list3 = Arrays.asList(8, 7, 9);
		// List<Integer> mergeList = new ArrayList<Integer>();

//		mergeList.addAll(list2);
//		mergeList.addAll(list1);
//		mergeList.addAll(list3);
//
//		System.out.println(mergeList);

//		List<List<Integer>> newList = new ArrayList<List<Integer>>();
//		newList.add(list1);
//		newList.add(list2);
//		newList.add(list3);
//		System.out.println(newList);
//
//		List<Integer> resultList = new ArrayList<Integer>();
//		for (List<Integer> l : newList) {
//			for (Integer i : l) {
//				if (!resultList.contains(i))
//					resultList.add(i);
//			}
//		}
//		System.out.println(resultList);
//
//		List<Integer> collect = newList.stream().flatMap(list -> list.stream()).distinct().collect(Collectors.toList());
//		System.out.println(collect);

		List<Student> students = Arrays.asList(new Student(1, "Sankalp", Arrays.asList("Singing", "Riding")),
				new Student(2, "Sameer", Arrays.asList("Dancing", "Riding")),
				new Student(3, "Sanskar", Arrays.asList("Singing", "Cricket")));
		System.out.println(students);

		List<String> nameList = students.stream().map(n -> n.getName()).collect(Collectors.toList());
		System.out.println(nameList);
		List<String> collect2 = students.stream().flatMap(n -> n.getHobbies().stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(collect2);
		List<String> collect3 = students.stream().flatMap(n -> n.getHobbies().stream()).filter(n->n.endsWith("ing")).distinct()
				.collect(Collectors.toList());
		System.out.println(collect3);

	}

}
