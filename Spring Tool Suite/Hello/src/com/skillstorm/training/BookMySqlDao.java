package com.skillstorm;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.skillstorm.DbConfig;
import com.skillstorm.Book;

public class BookMySqlDao implements BookDao, AutoCloseable {

	// I need a connection to run the queries I want to run
	private Connection conn;

	public BookMySqlDao() throws IOException, SQLException {
		conn = getConnection();
	}

	private Connection getConnection() throws IOException, SQLException {
		if (conn != null)
			return conn;
		// else
		DbConfig config = DbConfig.getInstance();
		return DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
	}

	@Override
	public List<Book> findByGenre() throws SQLException, IOException {
		DbConfig config = DbConfig.getInstance();
		List<Book> books = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword())) {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery("SELECT * FROM books");
			while (results.next()) {
				String title = results.getString("title");
				String authorFirstName = results.getString("author_first_name");
				String authorLastName = results.getString("author_last_name");
				int releaseYear = results.getInt("year");
				String genre = results.getString("genre");
				String isbn = results.getString("isbn");
				Book book = new Book(isbn, authorFirstName, authorLastName, title, genre, releaseYear);
				books.add(book);
			}
			return null;

		}
	}
	@Override
	public Book findByIsbn(String isbn) throws SQLException, IOException {
		DbConfig config = DbConfig.getInstance();
		try (Connection conn = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword())) {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery("select * from bookstore.books where isbn = '" + isbn + "'");
			if (results.next()) {
				String title = results.getString("title");
				String authorFirstName = results.getString("author_first_name");
				String authorLastName = results.getString("author_last_name");
				int releaseYear = results.getInt("year");
				String genre = results.getString("genre");
				Book book = new Book(isbn, authorFirstName, authorLastName, title, genre, releaseYear);
				return book;
			}
			return null;

		}
	}

	@Override
	public Book findByTitle(String title) throws SQLException, IOException {
		DbConfig config = DbConfig.getInstance();
		try (Connection conn = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword())) {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery("select * from bookstore.books where title = '" + title + "'");
			if (results.next()) {
//				String title = results.getString("title");
				String authorFirstName = results.getString("author_first_name");
				String authorLastName = results.getString("author_last_name");
				int releaseYear = results.getInt("year");
				String genre = results.getString("genre");
				String isbn = results.getString("isbn");
				Book book = new Book(isbn, authorFirstName, authorLastName, title, genre, releaseYear);
				return book;
			}
			return null;

		}
	}
	@Override
	public Book findByAuthor(String authorLastName) throws SQLException, IOException {
		DbConfig config = DbConfig.getInstance();
		try (Connection conn = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword())) {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery("select * from bookstore.books where author_last_name = '" + authorLastName + "'");
			if (results.next()) {
				String title = results.getString("title");
				String authorFirstName = results.getString("author_first_name");
//				String authorLastName = results.getString("author_last_name");
				int releaseYear = results.getInt("year");
				String genre = results.getString("genre");
				String isbn = results.getString("isbn");
				Book book = new Book(isbn, authorFirstName, authorLastName, title, genre, releaseYear);
				return book;
			}
			return null;

		}
	}

	private List<Book> read(ResultSet rs) throws SQLException {
		List<Book> books = new ArrayList<>();
		while (rs.next()) {
			String genre = rs.getString("genre");
			String title = rs.getString("title");
			String authorFirstName = rs.getString("author_first_name");
			String authorLastName = rs.getString("author_last_name");
			String isbn = rs.getString("isbn");
			int releaseYear = rs.getInt("year");
			Book book = new Book(isbn, authorFirstName, authorLastName, title, genre, releaseYear);
			books.add(book);
//			System.out.println(title + " (" + releaseYear + ")");
		}
		return books;
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
		if (conn != null)
			conn.close();
	}

	



	@Override
	public List<Book> findAll() throws SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByAuthor(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByTitle() throws SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}



}
