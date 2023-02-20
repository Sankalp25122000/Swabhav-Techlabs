package com.aurionpro.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();

		hm.put(100, "Sameer");
		hm.put(101, "Sankalp");
		hm.put(102, "Jayesh");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	    System.out.println("Keys: "+hm.keySet()); //to get all the keys
	    System.out.println("Values: "+hm.values());  //to get all the values
	    System.out.println("Values: "+hm.entrySet()); //to all the key values pairs
	   System.out.println( hm.remove(102));
	}

}
