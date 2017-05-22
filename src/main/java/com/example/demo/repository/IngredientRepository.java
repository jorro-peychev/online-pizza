package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domain.Ingredient;

public interface IngredientRepository extends PagingAndSortingRepository<Ingredient, Long>{
	Page<Ingredient> findAll(Pageable pageable);
}
