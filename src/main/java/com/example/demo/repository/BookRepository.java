package com.example.demo.repository;

import org.springframework.data.repository.Repository;

import com.example.demo.domain.Book;

public interface BookRepository extends Repository<Book, Long> {

}
