package com.example.demo.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	
	private static final Logger log = LoggerFactory.getLogger(OrderController.class);

	
	@GetMapping("/order")
	public String orderPizza() {
		log.warn("warning");

		return "test";
	}
}
