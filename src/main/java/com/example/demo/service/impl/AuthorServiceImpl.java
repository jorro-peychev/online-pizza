package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Author;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.service.AuthorService;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
	private AuthorRepository authorDao;

	@Autowired
	public AuthorServiceImpl(AuthorRepository authorDao) {
		super();
		this.authorDao = authorDao;
	}
	
	public List<Author> findAll(){
		return authorDao.findAll();
	}

	@Override
	public void feedAuthors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Author> allAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long createAuthor(Author author) {
		// TODO Auto-generated method stub
		return null;
	}
}
