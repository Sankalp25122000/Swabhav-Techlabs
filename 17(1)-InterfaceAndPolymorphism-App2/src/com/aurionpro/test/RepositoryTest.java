package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
		ProductRepository pd = new ProductRepository();
		CustomerRepository cd = new CustomerRepository();
		OrderRepository od = new OrderRepository();
		
		doDbOperation(pd);
		doDbOperation(cd);
		doDbOperation(od);
		
	}

	private static void doDbOperation(IRepository id) {
		id.create();
		id.read();
		id.update();
		id.delete();
		System.out.println();
		
	}

}
