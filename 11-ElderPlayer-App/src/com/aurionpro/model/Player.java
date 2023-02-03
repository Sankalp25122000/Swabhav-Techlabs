package com.aurionpro.model;

public class Player {
	private String name;
	private int age;
	private String country;

	public Player(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static Player getElderPlayer(Player[] arr) {
		int max = arr[0].getAge();
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < (arr[i].getAge())) {
				max = arr[i].getAge();
				index = i;
			}
		}
		return arr[index];

	}
}
