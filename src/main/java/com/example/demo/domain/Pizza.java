package com.example.demo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.example.demo.domain.base.AbstractEntity;


@Entity
public class Pizza extends AbstractEntity {
	private String name;
//	private List<Ingredient> ingredients;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@ManyToMany(targetEntity = Ingredient.class, fetch = FetchType.LAZY)
//	@JoinTable(name = "PIZZA_INGIRIDANT_LINKS", joinColumns = @JoinColumn(name = "pizza_id"),
//			inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
//	@LazyCollection(LazyCollectionOption.EXTRA)
//	public List<Ingredient> getIngredients() {
//		return ingredients;
//	}

//	public void setIngredients(List<Ingredient> ingredients) {
//		this.ingredients = ingredients;
//	}
	
}