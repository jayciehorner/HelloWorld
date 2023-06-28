package com.skillstorm.training.services;
import java.util.List;
import com.skillstorm.training.models.Book;
public interface BookService {
	public Book findById(String id);
	
	public Iterable<Book> findAll();
	
	public Book save(Book book);
	
	public void delete(Book book);
	
	
}