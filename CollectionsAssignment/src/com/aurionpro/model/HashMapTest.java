package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(100, "Sankalp");
		map.put(101, "Tejas");
		map.put(102, "Sameer");
		map.put(103, "Gurav");
		System.out.println("Initial list of elements: " + map);
		// key-based removal
		map.remove(100);
		System.out.println("Updated list of elements: " + map);
		// key-value pair based removal
		map.remove(102, "Sameer");
		System.out.println("Updated list of elements: " + map);

	}

}
