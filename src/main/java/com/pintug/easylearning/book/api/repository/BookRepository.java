package com.pintug.easylearning.book.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pintug.easylearning.book.api.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

	Optional<Book> findById(Integer id);

}
