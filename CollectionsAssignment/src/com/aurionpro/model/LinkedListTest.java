package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>();
		al.add("Sankalp");
		al.add("Sameer");
		al.add("Gitesh");
		al.add("Jayesh");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.add(1, "Devdatta");
		System.out.println(al);
		List<String> al2 = new LinkedList<>();
		al2.add("Tejas");
		al2.add("Akshay");
		al.addAll(0, al2);
		System.out.println(al);
		al.addFirst("Sukesh");
		al.addLast("Jaqueline");
		System.out.println(al);
		al.remove(0);
		al.remove("Jaqueline");
		System.out.println(al);
		al.add("Tejas");
		al.addLast("Sankalp");
		System.out.println(al);
		al.removeFirstOccurrence("Tejas");
		al.removeLastOccurrence("Sankalp");
		System.out.println(al);
		Iterator i = al.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
