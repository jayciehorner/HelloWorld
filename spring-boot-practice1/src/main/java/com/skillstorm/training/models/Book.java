package com.skillstorm.training.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@Column(name = "isbn")
	private String isbn;
	private String authorFirstName;
	private String authorLastName;
	private String title;
	private String genre;
	private int year;
	
	public Book() {
		this.title = "unknown";
	}
	public Book(String isbn, String authorFirstName, String authorLastName, String title, String genre, int year) {
		super();
		this.isbn = isbn;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.title = title;
		this.genre = genre;
		this.year = year;
		
	
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", authorFirstName=" + authorFirstName + ", authorLastName=" + authorLastName
				+ ", title=" + title + ", genre=" + genre + ", year=" + year + "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
		
	}
	
	

}