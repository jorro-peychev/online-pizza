package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Author;

public interface AuthorService {
	void feedAuthors();
	List<Author> allAuthors();
	Long createAuthor(Author author);
}
