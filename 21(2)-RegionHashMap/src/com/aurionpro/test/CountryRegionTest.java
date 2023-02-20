package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class CountryRegionTest {

	public static void main(String[] args) {

		Map<Integer,Region> regionList = new HashMap<>();
		
		regionList.put(1, new Region(1, "Europe"));
		regionList.put(2, new Region(2, "Americas"));
		regionList.put(3, new Region(3, "Asia"));
		regionList.put(4, new Region(4, "Middle East and Africa"));
		System.out.println(regionList);

		List<Country> countries = new ArrayList<>();

		countries.add(new Country("IT", "Italy", 1));
		countries.add(new Country("JP", "Japan", 3));
		countries.add(new Country("US", "United States of America", 2));
		countries.add(new Country("CA", "Canada", 2));
		countries.add(new Country("CN", "China", 3));
		countries.add(new Country("IN", "India", 3));
		countries.add(new Country("AU", "Australia", 3));
		countries.add(new Country("ZW", "Zimbabwe", 4));
		countries.add(new Country("SG", "Singapore", 3));
		countries.add(new Country("UK", "United Kingdom", 1));
		countries.add(new Country("FR", "France", 1));
		countries.add(new Country("DE", "Germany", 1));
		countries.add(new Country("ZM", "Zambia", 4));
		countries.add(new Country("EG", "Egypt", 4));
		countries.add(new Country("BR", "Brazil", 2));
		countries.add(new Country("CH", "Switzerland", 1));
		countries.add(new Country("NL", "Netherlands", 1));
		countries.add(new Country("MX", "Mexico", 2));
		countries.add(new Country("KW", "Kuwait", 4));
		countries.add(new Country("IL", "Israel", 4));
		countries.add(new Country("DK", "Denmark", 1));
		countries.add(new Country("HK", "HongKong", 3));
		countries.add(new Country("NG", "Nigeria", 4));
		countries.add(new Country("AR", "Argentina", 2));
		countries.add(new Country("BE", "Belgium", 1));
		//System.out.println(countries);
		
		for(Country x : countries) {
			int id = x.getRegionCode();
			regionList.get(id).addCountries(x);
	
			}
		System.out.println(regionList);
		System.out.println("\nNumber of countries in each region");
		for(Integer x: regionList.keySet()) {
			System.out.println(regionList.get(x).getName()+" : "+regionList.get(x).getCountries().size());
		}
	}

}
