package com.aurionpro.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {

		int ch;

		FileReader fr = null;
		try {
			fr = new FileReader("D:\\Sankalp\\swabhav\\names.txt");
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}

		while ((ch = fr.read()) != -1)
			System.out.print((char) ch);

		fr.close();
	}
}
