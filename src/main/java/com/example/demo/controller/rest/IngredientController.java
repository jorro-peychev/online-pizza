package com.example.demo.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Ingredient;
import com.example.demo.service.IngredientService;

@RestController
public class IngredientController {
	private static final Logger log = LoggerFactory.getLogger(IngredientController.class);
	private IngredientService ingredientService;
	
	@Autowired
	public IngredientController(IngredientService ingredientService) {
		super();
		this.ingredientService = ingredientService;
	}

	@GetMapping("/ingredients")
	public Page<Ingredient> getIngredients(Pageable pageable) {
		return this.ingredientService.findAll(pageable);
	}
}
