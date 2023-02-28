package com.aurionpro.model;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		   Deque<String> deque = new ArrayDeque<>();  
		   deque.add("Sankalp");    
		   deque.add("Sameer");     
		   deque.add("Ajay");   
		   System.out.println(deque);
		   //this adds element at first
		   deque.offerFirst("San");
		   System.out.println(deque);
		   //this removes element at last
		   deque.pollLast();
		   System.out.println(deque);
		   //first element gets pop out
		   deque.pop();
		   System.out.println(deque);

	}

}
				