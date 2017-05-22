package com.example.demo.domain;

import javax.persistence.Entity;

import com.example.demo.domain.base.AbstractEntity;

@Entity
public class Ingredient extends AbstractEntity {
	private String name;
//	private List<Pizza> pizzas;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "ingredients", targetEntity = Pizza.class)
//	@LazyCollection(LazyCollectionOption.EXTRA)
//	public List<Pizza> getPizzas() {
//		return pizzas;
//	}
//
//	public void setPizzas(List<Pizza> pizzas) {
//		this.pizzas = pizzas;
//	}
}