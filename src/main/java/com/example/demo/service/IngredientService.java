package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.domain.Ingredient;

public interface IngredientService {
	Page<Ingredient> findAll(Pageable pageable);
}
