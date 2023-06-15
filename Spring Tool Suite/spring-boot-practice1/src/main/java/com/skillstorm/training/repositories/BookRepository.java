package com.skillstorm.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
	
}