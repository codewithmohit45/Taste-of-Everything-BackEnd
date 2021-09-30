package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.app.repository.CustomerRepository;

@DataJpaTest
public class CustomerTest {

	@Autowired
	private CustomerRepository repo;
	
	@Test
	public void addcustomer() {
		
	}
}
