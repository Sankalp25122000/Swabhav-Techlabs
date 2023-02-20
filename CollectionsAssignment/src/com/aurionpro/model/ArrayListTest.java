package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> arlist = new ArrayList<>();
		// Adding
		arlist.add(3);
		arlist.add(2);
		arlist.add(1);
		arlist.add(4);
		System.out.println(arlist);
		// or Iterating loop
		for (Integer x : arlist) {
			System.out.println(x);
		}
		// for sorting
		Collections.sort(arlist);
		System.out.println(arlist);
		// for getting an element with an index
		System.out.println(arlist.get(1));
		List<Integer> arlist2 = new ArrayList<>();
		arlist2.add(7);
		arlist2.add(6);
		arlist2.add(2);
		// adding all element of arlist2 to arlis1
		arlist.addAll(arlist2);
		System.out.println(arlist);
		// removing element from arlist of arlist2
		arlist.removeAll(arlist2);
		System.out.println(arlist);

		// to check if list is empty or not
		System.out.println(arlist.isEmpty());
		//to find size
		System.out.println(arlist.size());

	}

}
