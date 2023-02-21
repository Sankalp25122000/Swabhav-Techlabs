package com.aurionpro.model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieController {
	MovieManager manager;

	public MovieController() {
		super();
		this.manager = new MovieManager();
	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {
		int input = 1;
		System.out.println("Hello sir !! I am your movies manager");
		while (input != 5) {

			System.out.println("Enter 1 to add movie");
			System.out.println("Enter 2 to display movie");
			System.out.println("Enter 3 to to delete all movies");
			System.out.println("Enter 4 to delete movie by id");
			System.out.println("Enter 5 to exit menu");

			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			switch (input) {
			case 1:
				Movie movie = setMovieDetails();
				manager.addMovie(movie);
				break;
			case 2:
				List<Movie> movies = manager.getMovies();
				if (movies.size() != 0) {
					Iterator<Movie> itr = movies.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next());

					}
				} else
					System.out.println("List is empty");
				break;
			case 3:
				if (manager.getMovies().size() != 0) {
					manager.clearMovie();
					System.out.println("all movies deleted");
				} else
					System.out.println("Nothing to delete. Movie list is empty");
				break;
			case 4:
				System.out.println("Enter movie id to delete");
				int id = sc.nextInt();
				if (manager.deleteMovie(id)) {
					System.out.println("Movie deleted successfully");
				} else
					System.out.println("id not found");

				
			case 5:
				System.out.println("End of program");
				break;
			default:
				System.out.println("Invalid choice");
				break;

			}
		}
	}

	private Movie setMovieDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Movie name");
		String name = sc.nextLine();

		System.out.println("Enter Movie year");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Movie genre");
		String genre = sc.nextLine();

		return new Movie(id, name, year, genre);

	}

}
