package com.app.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerService;



@Service

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer addCustomer(Customer customer) 
	{
		return repository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) 
	{
		return repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() 
	{
		return repository.findAll();
	}

	@Override
	public Customer getCustomerById(int customerId) 
	{
		return repository.findById(customerId).get();
	}

	@Override
	public void deleteCustomer(int customerId) {
		

		repository.deleteById(customerId);
		
	}

	@Override
	public Customer getCustomerByCustomerEmailAndCustomerPassword(String customerEmail, String customerPassword) throws Exception {
		Customer cus=null;
		if(customerEmail!=null && customerPassword!=null )
			cus=repository.findCustomerByCustomerEmailAndCustomerPassword(customerEmail,customerPassword);
		if(cus==null)
		{
			return null;
		}
		return cus;
	}

}
