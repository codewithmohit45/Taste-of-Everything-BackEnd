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

	
	@GetMapping("/customer/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		return service.getCustomerById(customerId);
	}

	@DeleteMapping("/customer/{customerId}")
	public void deleteCustomer(@PathVariable int customerId)
	{
			service.deleteCustomer(customerId);
	}
	
	//                   ***************LOGIN******************
	@GetMapping("/customer/login/{customerEmail}/{customerPassword}")
	public Customer getCustomer(@PathVariable String customerEmail,@PathVariable String customerPassword) throws Exception 
	{
		//String customerEmail=customer.getCustomerEmail();
		//String customerPassword=customer.getCustomerPassword();
		return service.getCustomerByCustomerEmailAndCustomerPassword(customerEmail, customerPassword);		
	}
}
	
	

