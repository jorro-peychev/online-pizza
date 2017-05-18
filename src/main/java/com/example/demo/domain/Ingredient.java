package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.example.demo.domain.base.AbstractEntity;

public class Ingredient extends AbstractEntity {
	private String name;
	private List<Pizza> pizzas;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(cascade = { CascadeType.PERSIST,
			CascadeType.MERGE }, mappedBy = "folders", targetEntity = Pizza.class)
	@LazyCollection(LazyCollectionOption.EXTRA)
	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
}