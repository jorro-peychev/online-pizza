package com.example.demo.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.demo.domain.Pizza;



@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = "spring.jpa.hibernate.use-new-id-generator-mappings=false")
public class PizzaRepositoryIntegrationTest {
	
	@Autowired
	PizzaRepository pizzaRepository;
	
	@Test
	public void testFindByName() {
		Pizza pizza = pizzaRepository.findByName("margarita");
		assertThat(pizza.getName()).isEqualTo("margarita");
	}
}
