package com.aurionpro.model;

import java.util.HashSet;

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Student> stu = new HashSet<>();
		stu.add(new Student(1, "Sankalp"));
		stu.add(new Student(2, "Sameer"));
		stu.add(new Student(3, "Tejas"));
		stu.add(new Student(4, "Akshay"));
		stu.add(new Student(4, "Akshay"));
		for(Student x : stu) {
			System.out.println(x);
		}

	}

}
