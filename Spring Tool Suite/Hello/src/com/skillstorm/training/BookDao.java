package com.skillstorm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.skillstorm.Book;

/*
 * This class contains the CRUD methods
 * 
 * The Data Access Object is a class where we put all the logic for interacting with the database
 * Have a separate DAO for each table/entity
 */
public interface BookDao extends AutoCloseable {
	
	// findAll() returns List<Book>
	List<Book> findAll() throws SQLException, IOException;
	
	// findById(int isbn) returns Optional<Book> -- this is our primary key
	Book findByIsbn(String isbn) throws SQLException, IOException;
	
	// save(Book book) returns Book (this is useful if we have an auto incremented id)
	Book save(Book book);
	
	// update(Book book) returns int (number of rows updated)
	int update(Book book);
	
	// delete(int id) or delete(T entity) returns int (number of rows deleted)
	boolean delete(int id);

	List<Book> findByGenre(String genre);

	Book findByTitle(String title) throws SQLException, IOException;

	List<Book> findByAuthor(String firstName, String lastName);

	List<Book> findByGenre() throws SQLException, IOException;

	List<Book> findByTitle() throws SQLException, IOException;

	Book findByAuthor(String authorLastName) throws SQLException, IOException;
}