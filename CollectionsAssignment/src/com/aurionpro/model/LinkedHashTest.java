package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashTest {

	public static void main(String[] args) {
		LinkedHashSet<String> al = new LinkedHashSet<>();
		al.add("Sankalp");
		al.add("Sameer");
		al.add("Jayesh");
		al.add("Jayesh");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println(al.remove("Jayesh"));
		System.out.println(al.remove("Tejas"));
		System.out.println(al);
		

	}
}
