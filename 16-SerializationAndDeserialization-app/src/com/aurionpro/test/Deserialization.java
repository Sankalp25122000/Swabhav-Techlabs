package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Student;

public class Deserialization  {

	public static void main(String[] args) {

		Student student1 = null;
		String filename = "test1.txt";

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			student1 = (Student) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("ID = " + student1.getId());
			System.out.println("Name = " + student1.getName());
			System.out.println("Percentage = " + student1.getPercentage());

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

}
