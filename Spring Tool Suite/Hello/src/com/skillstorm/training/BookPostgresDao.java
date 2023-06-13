package com.skillstorm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class BookPostgresDao implements BookDao, AutoCloseable {

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> findByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	

//	@Override
//	public List<Book> findByAuthor(String firstName, String lastName) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Book> findByGenre() throws SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByTitle() throws SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByTitle(String title) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByAuthor(String authorLastName) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByAuthor(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}