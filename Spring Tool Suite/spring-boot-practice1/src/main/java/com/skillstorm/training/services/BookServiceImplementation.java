package com.skillstorm.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.training.models.Book;
import com.skillstorm.training.repositories.BookRepository;

@Service
public class BookServiceImplementation implements BookService {
	@Autowired
	private BookRepository repo;

	@Override
	public Book findById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub
		repo.delete(book);
	}

}