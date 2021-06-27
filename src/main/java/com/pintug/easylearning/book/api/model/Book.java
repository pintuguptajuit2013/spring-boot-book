package com.pintug.easylearning.book.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {
	@Id
	private Integer bookID;
	@Column(length=10485760)
	private String title;
	@Column(length=10485760)
	private String authors;
	@Column(length=10485760)
	private String average_rating;
	@Column(length=10485760)
	private String isbn;
	@Column(length=10485760)
	private String language_code;
	@Column(length=10485760)
	private String ratings_count;
	private Integer price;
	
	
	public Book() {
		super();
	}


	public Integer getBookID() {
		return bookID;
	}


	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthors() {
		return authors;
	}


	public void setAuthors(String authors) {
		this.authors = authors;
	}


	public String getAverage_rating() {
		return average_rating;
	}


	public void setAverage_rating(String average_rating) {
		this.average_rating = average_rating;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getLanguage_code() {
		return language_code;
	}


	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}


	public String getRatings_count() {
		return ratings_count;
	}


	public void setRatings_count(String ratings_count) {
		this.ratings_count = ratings_count;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	
	
	
}
