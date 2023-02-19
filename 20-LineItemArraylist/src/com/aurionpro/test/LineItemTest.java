package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		List<LineItem> list = new ArrayList<>();
		LineItem item1 = new LineItem(1, "ParleG", 2, 10);
		LineItem item2 = new LineItem(2, "KhaleG", 5, 20);
		LineItem item3 = new LineItem(3, "JaleG", 3, 30);

		list.add(item1);
		list.add(item2);
		list.add(item3);
		list.add(new LineItem(4,"paleG",11,22));
		double totalCost = 0;
		
		for(LineItem x : list) {
			System.out.println(x);
			totalCost+= x.calculateCost();
		}
		System.out.println("TotalCost is "+totalCost);
	

	}

	

	}


