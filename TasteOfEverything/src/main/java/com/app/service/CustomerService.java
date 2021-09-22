package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public boolean checkCustomer(String cust_email,String cust_password);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public  Customer getCustomerById(int cust_id);
	public void deleteCustomerById(int cust_id); 
	
	

}
