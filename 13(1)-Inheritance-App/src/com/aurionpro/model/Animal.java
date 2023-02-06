package com.aurionpro.model;

public class Animal {
	private String name;
	private boolean isCarnivorous;
	
	public Animal(String name, boolean isCarnivorous) {
		this.name = name;
		this.isCarnivorous = isCarnivorous;
		//System.out.println("Animal Constructor is called..");
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", isCarnivorous=" + isCarnivorous + "]";
	}

	public void eat() {
		System.out.println("Animal eats..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCarnivorous() {
		return isCarnivorous;
	}

	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}

	
	

}
