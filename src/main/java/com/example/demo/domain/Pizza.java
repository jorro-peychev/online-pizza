package com.example.demo.domain;

import javax.persistence.Entity;

import com.example.demo.domain.base.AbstractEntity;

@Entity
public class Pizza extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
