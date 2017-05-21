package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Pizza;
import com.example.demo.repository.PizzaRepository;
import com.example.demo.service.PizzaService;

@Service("pizzaService")
public class PizzaServiceImpl implements PizzaService {
	
	private PizzaRepository pizzaRepository;

	@Autowired
	public PizzaServiceImpl(PizzaRepository pizzaRepository) {
		super();
		this.pizzaRepository = pizzaRepository;
	}

	@Override
	public Pizza findByName(String name) {
		return pizzaRepository.findByName(name);
	}

	@Override
	public Page<Pizza> findAll(Pageable pageable) {
		return pizzaRepository.findAll(pageable);
	}

	@Override
	public Pizza findById(Long pizzaId) {
		return pizzaRepository.findOne(pizzaId);
	}

}
