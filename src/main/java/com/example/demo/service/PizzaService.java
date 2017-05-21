package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.domain.Pizza;

public interface PizzaService {
	Pizza findByName(String name);
	Page<Pizza> findAll(Pageable pageable);
	Pizza findById(Long pizzaId);
}
