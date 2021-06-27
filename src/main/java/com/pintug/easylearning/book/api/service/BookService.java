package com.pintug.easylearning.book.api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pintug.easylearning.book.api.model.Book;
import com.pintug.easylearning.book.api.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	public Book getBookDetails(Integer id) {
		Optional<Book> bookOps = bookRepository.findById(id);
		return bookOps.isPresent() ?bookOps.get():null;
	}
	
	public List<Book> getBookDetailsForTerm(String term) {
		List<Book> books = bookRepository.findAll();
		return books.stream().filter(book -> book.getTitle().contains(term)).collect(Collectors.toList());
	}

	public List<Book> insertData(String uri) {
		RestTemplate template = new RestTemplate();
		ResponseEntity<List<Book>> rateResponse = template.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Book>>() {
				});
		List<Book> books = rateResponse.getBody();
		return bookRepository.saveAll(books);

	}

}
