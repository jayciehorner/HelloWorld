package com.skillstorm;

import java.util.List;
import java.util.Scanner;

import com.skillstorm.BookDao;
import com.skillstorm.BookMySqlDao;
import com.skillstorm.Book;

public class MyApp {

	// SQL Injections - when user input is run as sql code it is risky
	// Example: Enter in the String: " OR 1 = 1; --
	// when calling the findByGenre to get all instead
	// (don't forget space after -- )
	public static void main(String[] args) throws Exception {
		// This is an app that takes requests from a user
		// and displays data from a database
		Scanner in = new Scanner(System.in);

		System.out.println("'Romance'\r\n"
				+ "'Fiction'\r\n"
				+ "'Comedy'\r\n"
				+ "'Animation'\r\n");
		System.out.println("What type of book are you looking for? ");
		String genre = in.nextLine();
		
		try (BookDao dao = new BookMySqlDao()) {
			
			List<Book> books = dao.findByGenre(genre);
			System.out.println("Here is the list of books in the " + genre + " genre:");
			System.out.println(books);
		
//		in.close();
		
		System.out.println("What is the ISBN you are looking for?");
		String isbn = in.nextLine();
		Book isbn2 = dao.findByIsbn(isbn);
		System.out.println(isbn2);
		
		System.out.println("What is the title you are looking for?");
		String title = in.nextLine();
		Book title2 = dao.findByTitle(title);
		System.out.println(title2);
		
		System.out.println("What is the author's last name you are looking for?");
		String authorLastName = in.nextLine();
		Book authorLastName2 = dao.findByAuthor(authorLastName);
		System.out.println(authorLastName2);
		
		}
	}

}