package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerService;
@RunWith(SpringRunner.class)
@SpringBootTest
class TasteOfEverythingApplicationTests {

	@Autowired
	private CustomerService customerService;
	
	@MockBean
	private CustomerRepository repository;
	
	@Test
	 public void addCustomerTest() throws Exception {
		Customer customer=new Customer(1,"raja@gmail.com", "root", "raja", 9098896678L, "male");
		when(repository.save(customer)).thenReturn(customer);
		assertEquals(customer,customerService.addCustomer(customer));

	} 
	
	@Test
	void contextLoads() {
	}

}
