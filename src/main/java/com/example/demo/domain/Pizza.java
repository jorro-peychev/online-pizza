package com.example.demo.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.domain.base.AbstractEntity;


@Entity
public class Pizza extends AbstractEntity<Long> {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "Name is required.")
	@Length(max = 30)
	private String name;
	
	@Digits(integer = 10, fraction = 3)
	private BigDecimal basePrice;
	
	@Length(max = 50)
	// TODO show it only to admin user
	private String recipe;
	
	//private List<Ingredient> ingredients;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
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