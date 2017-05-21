package com.example.demo.application.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.example.demo.domain.Pizza;
import com.example.demo.service.PizzaService;

public class PizzaIdToPizzaConverter implements Converter<Long, Pizza> {

	@Autowired
	PizzaService pizzaService;
	
	@Override
	public Pizza convert(Long pizzaId) {
		return pizzaService.findById(pizzaId);
	}

}
