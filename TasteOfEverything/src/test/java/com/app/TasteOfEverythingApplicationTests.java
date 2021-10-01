package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	public void updateCustomerTest() throws Exception{
		Customer customer=new Customer(1,"raja@gmail.com", "root", "raja", 9098896678L, "male");
		when(repository.save(customer)).thenReturn(customer);
		assertEquals(customer, customerService.updateCustomer(customer), "updated Successfully");
		
	}
	
	@Test
	public void getAllCustomerTest()throws Exception{
		when(repository.findAll()).thenReturn(Stream.of(new Customer(1,"raja@gmail.com", "root", "raja", 9098896678L, "male"), new Customer(2,"raja@gmail.com", "root", "raja", 9098896678L, "male")).collect(Collectors.toList()));
		assertEquals(2,customerService.getAllCustomers().size());
	}



//	@Test
//	public void deleteCustomer(int customerId){
//		Customer c=new Customer();
//		c.setCustomerId(34);
//		customerService.deleteCustomer(c.getCustomerId());
//		verify(repository,times(1)).deleteById(c.getCustomerId());
//	}
}
