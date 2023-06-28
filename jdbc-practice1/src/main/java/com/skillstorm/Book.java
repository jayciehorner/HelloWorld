package com.skillstorm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Book implements List<Book> {
	// Must exactly match my table
	private String isbn;
	private String authorFirstName;
	private String authorLastName;
	private String title;
	private String genre;
	private int year;
	// Make sure you have
	// - getters/setters
	// - constructor
	// - toString
	// (optional: equals and hashCode) we may not use today but good to have around
	
	public Book(String isbn, String authorFirstName, String authorLastName,
			String title, String genre, int year) {
		super();
		this.isbn = isbn;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", authorFirstName=" + authorFirstName
				+ ", authorLastName=" + authorLastName + ", title=" + title
				+ ", genre=" + genre + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorFirstName, authorLastName, genre, isbn, title,
				year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(authorFirstName, other.authorFirstName)
				&& Objects.equals(authorLastName, other.authorLastName)
				&& Objects.equals(genre, other.genre)
				&& Objects.equals(isbn, other.isbn)
				&& Objects.equals(title, other.title) && year == other.year;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<Book> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(Book e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends Book> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends Book> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Book get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Book set(int index, Book element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, Book element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Book remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<Book> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<Book> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}