package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;

import com.aurionpro.model.Student;

public class Serialization {

	public static void main(String[] args) {
		Student student = new Student(1, "Sankalp", 82.00);
		String filename = "test1.txt";

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(student);

			out.close();
			file.close();

			System.out.println("Object has been serialized");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}

	}

}
