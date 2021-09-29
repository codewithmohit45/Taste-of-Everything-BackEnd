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
	public List<Customer> getAllCustomer() 
	{
		return repository.findAll();
	}

	@Override
	public Customer getCustomerById(int cust_id) 
	{
		return repository.findById(cust_id).get();
	}

	@Override
	public void deleteCustomer(int cust_id) {

		repository.deleteById(cust_id);
		System.out.println("Customer Deleted SuccessFully");
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
