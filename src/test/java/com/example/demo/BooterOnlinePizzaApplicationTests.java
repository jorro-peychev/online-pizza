package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Author;
import com.example.demo.service.AuthorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BooterOnlinePizzaApplicationTests {

//	@Autowired
//	private AuthorService authorService;
	
	@Test
	public void contextLoads() {
	}
	
	
	@Test
	public void contextCompare() {
	}


	
	
	@Test
	private void testAuthorsCreate() {
		//List<Author> authors = authorService.allAuthors();
	}
}
