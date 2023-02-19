package com.aurionpro.model;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<>();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(10);  //HashSet don't allow duplicate values 
		Iterator<Integer> i = hash.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
