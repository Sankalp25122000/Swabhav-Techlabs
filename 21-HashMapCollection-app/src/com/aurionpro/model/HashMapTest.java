package com.aurionpro.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "Sankalp");
		hm.put(2, "Sameer");
		hm.put(3, "Akshay");
		hm.put(4, "Tejas");
		System.out.println(hm);
		hm.remove(4);
		int index = -1;//index 0 is also valid index
		for (Entry<Integer, String> x : hm.entrySet()) {
			
			if (x.getValue().equals("Sameer")) {
				index = x.getKey();
			}
		
		}	hm.remove(index);

		// type map.entry();then click ctrl1 on it and select assigned local variable
		// comment it out and us it in a for loop
		// Set<Entry<Integer, String>> entrySet = hm.entrySet();
//
//		for (Entry<Integer, String> x : hm.entrySet()) {
//			System.out.println(x.getKey() + " : " + x.getValue());
//		}

//		for (Map.Entry m : hm.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
		// for each method
		// hm.forEach((key, value) -> System.out.println(key + " : " + value));

		for (Integer x : hm.keySet()) {
			System.out.println(x + " : " + hm.get(x));
		}

	}

}
