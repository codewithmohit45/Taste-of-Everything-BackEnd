package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerService;


@RestController
@CrossOrigin
public class CustomerController {
    
	@Autowired
	private CustomerService service;
	
	
	@PostMapping("/customer")
	public  Customer addCustomer(@RequestBody Customer customer) {
		 
		return service.addCustomer(customer);
	}
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return service.updateCustomer(customer);
	}
	@GetMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return service.getAllCustomer();
	}

	
	@GetMapping("/customer/{cust_id}")
	public Customer getCustomerById(@PathVariable int cust_id) {
		return service.getCustomerById(cust_id);
	}

	@DeleteMapping("/customer/{cust_id}")
	public void deleteCustomer(@PathVariable int cust_id)
	{
			service.deleteCustomer(cust_id);
	}
}
	
	

