package com.example.demo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Author;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {
	
	private AuthorService authorService;
	
	@Autowired
	public AuthorController(AuthorService authorService) {
		super();
		this.authorService = authorService;
	}

	@GetMapping("/authors")
	private  List<Author> getAllAuthors(){
		return authorService.allAuthors();
	}
	
	@PostMapping("/author")
	private Long createAuthor( @RequestBody Author author ){
		return authorService.createAuthor(author);
	}
}
