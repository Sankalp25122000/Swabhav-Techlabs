package com.aurionpro.model;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		   TreeMap<Integer,String> map=new TreeMap<>();    
		      map.put(100,"Sankalp");    
		      map.put(102,"Sameer");    
		      map.put(101,"Tejas");    
		      map.put(103,"Akshay");    
		      //Maintains descending order  
		      System.out.println("descendingMap: "+map.descendingMap());  
		      //gives values less than equal to provide value which is 102  
		      System.out.println("headMap: "+map.headMap(102,true));  
		      // gives values greater than equal to provide value which is 102
		      System.out.println("tailMap: "+map.tailMap(102,true));  
		      //gives values between mention key values  
		      System.out.println("subMap: "+map.subMap(100, false, 102, true)); 

	}

}
