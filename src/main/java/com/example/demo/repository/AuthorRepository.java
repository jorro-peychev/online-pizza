package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.domain.Author;

public interface AuthorRepository extends Repository<Author, Long> {
	List<Author> findAll();
}
