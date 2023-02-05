package com.aurionpro.test;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		try {
			FileWriter fwrite = new FileWriter("D:\\Sankalp\\swabhav\\File\\read.txt");
			fwrite.write("Adding text in the File");
			fwrite.close();
			System.out.println("File Writing successfully");

		} catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
		}

	}

}
