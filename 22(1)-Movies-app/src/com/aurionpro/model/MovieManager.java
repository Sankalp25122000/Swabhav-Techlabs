package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	private List<Movie> movies;
	static final String filepath = "./MovieData/data.bin";

	public MovieManager() {
		movies = new ArrayList<>();
		loadMovies();
	}

	private void loadMovies() {
		try {

			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(file);

			movies = (List<Movie>) in.readObject();

			in.close();
			file.close();

			// System.out.println("Object has been deserialized ");
//			System.out.println("ID = " + student1.getId());
//			System.out.println("Name = " + student1.getName());
//			System.out.println("Percentage = " + student1.getPercentage());
			// System.out.println(movies);

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
		saveMovie();
	}

	public void clearMovie() {
		movies.clear();
		saveMovie();
	}

	public boolean deleteMovie(int id) {

		int index = -1;
		for (int i = 0; i < movies.size(); i++) {
			if (movies.get(i).getId() == id) {
				index = i;
			}
		}
		if (index != -1) {
			movies.remove(index);
			saveMovie();
			return true;

		}

		return false;

	}

	private void saveMovie() {
		try {
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(movies);

			out.close();
			file.close();

			// System.out.println("Object has been serialized");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	}

	public List<Movie> getMovies() {
		return movies;
	}

}
