package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Ingredient;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.IngredientService;

@Service("IngredientService")
public class IngredientServiceImpl implements IngredientService {
	
	private IngredientRepository IngredientRepository;

	@Autowired
	public IngredientServiceImpl(IngredientRepository IngredientRepository) {
		super();
		this.IngredientRepository = IngredientRepository;
	}

	@Override
	public Page<Ingredient> findAll(Pageable pageable) {
		return IngredientRepository.findAll(pageable);
	}



}
