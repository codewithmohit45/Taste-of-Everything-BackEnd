package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public  Customer getCustomerById(int customerId);
	public void deleteCustomer(int customerId); 
	public Customer getCustomerByCustomerEmailAndCustomerPassword(String customerEmail,String customerPassword)throws Exception;
	
	

}
