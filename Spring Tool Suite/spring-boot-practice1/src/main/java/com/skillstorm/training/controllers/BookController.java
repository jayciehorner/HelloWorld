package com.skillstorm.training.controllers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.training.models.Book;
import com.skillstorm.training.services.BookService;
@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookService service;
	
//	@RequestMapping(value = "/books", method = RequestMethod.GET)
	@GetMapping
	public Iterable<Book> findAll() {
		List<Book> books = new ArrayList<>();
		return service.findAll();
	}
	
	@GetMapping("/{isbn}")
	public Book findByIsbn(@PathVariable String isbn) {
		Book book = new Book();
		book.setIsbn(isbn);
		System.out.println("ISBN = " + isbn);
		return service.findById(isbn);
	}
	
	@PostMapping
	public Book save(@RequestBody Book book) {
		return service.save(book);
	}
	
	@PutMapping
	public Book update(@RequestBody Book book) {
		return service.save(book);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Book book) {
		service.delete(book);
	}
}