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
	public boolean checkCustomer(String cust_email, String cust_password) {

//	    if(repository.findByCustomer(cust_email, cust_password))
//	    {
//	      return true;	
//	    }
//	    else {
//		return false;
//	}
		return false;

	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Customer getCustomerById(int cust_id) {
		// TODO Auto-generated method stub
		return repository.findById(cust_id).get();
	}

	@Override
	public void deleteCustomer(int cust_id) {

		repository.deleteById(cust_id);
		System.out.println("Customer Deleted SuccessFully");
	}

}
