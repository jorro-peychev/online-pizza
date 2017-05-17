package com.example.demo.service;

import com.example.demo.domain.Pizza;

public interface PizzaService {
	Pizza findByName(String name);
}
