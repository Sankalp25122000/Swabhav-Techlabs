package com.aurionpro.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		try {

			File f1 = new File("D:\\Sankalp\\swabhav\\File\\read.txt");
			Scanner dataReader = new Scanner(f1);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
				System.out.println("File Read");
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexcpected error occurred!");
			exception.printStackTrace();
		}

	}

}
