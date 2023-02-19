package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
//		System.out.println(list);
//		System.out.println(list.size());
//		for (Integer x : list) {
//			System.out.println(x);
//		}
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		list.forEach(System.out::println);
		list.remove(0);
		list.remove(new Integer(20));
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
