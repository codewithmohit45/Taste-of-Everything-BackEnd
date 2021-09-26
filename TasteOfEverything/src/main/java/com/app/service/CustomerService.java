package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public boolean checkCustomer(String customerEmail,String customerPassword);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public  Customer getCustomerById(int customerId);
	public void deleteCustomer(int customerId); 
	
	

}
