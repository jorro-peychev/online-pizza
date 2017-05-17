package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.example.demo.domain.Pizza;

public interface PizzaRepository extends Repository<Pizza, Long>{
	Pizza findByName(String name);
	Page<Pizza> findAll(Pageable pageable);
}
