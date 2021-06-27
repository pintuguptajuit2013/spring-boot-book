package com.pintug.easylearning.book.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pintug.easylearning.book.api.model.Book;
import com.pintug.easylearning.book.api.service.BookService;

@RestController
@RequestMapping
public class BookController {
	public static final String URI = "https://s3-ap-southeast-1.amazonaws.com/he-public-data/books8f8fe52.json";
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/")
	public List<Book> getDump() {
		return  bookService.insertData(URI);
	}
	
	
	
	@GetMapping("/{bookID}")
	public Book getBookDetails(@PathVariable Integer bookID) {
		bookService.insertData("https://s3-ap-southeast-1.amazonaws.com/he-public-data/books8f8fe52.json");
		return  bookService.getBookDetails(bookID);
	}
	
	@GetMapping("/search/{term}")
	public List<Book> getBookDetailsForTerm(@PathVariable String term) {
		bookService.insertData("https://s3-ap-southeast-1.amazonaws.com/he-public-data/books8f8fe52.json");
		return  bookService.getBookDetailsForTerm(term);
	}

}
