package com.example.demo.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Pizza;
import com.example.demo.service.PizzaService;

@RestController
public class PizzaController {

	private static final Logger log = LoggerFactory.getLogger(PizzaController.class);
	
	private PizzaService pizzaService;

	@Autowired
	public PizzaController(PizzaService pizzaService) {
		super();
		this.pizzaService = pizzaService;
	}
	
	
	@GetMapping("/search-pizza/{pizzaName}")
	public Pizza searchPizza(@PathVariable String pizzaName) {
		log.warn("warning");
		return pizzaService.findByName(pizzaName);
	}
}
