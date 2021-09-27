package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	//boolean findByCustomer(String cust_username,String cust_password);
                public Customer findCustomerByCustomerEmailAndCustomerPassword(String customerEmail, String customerPassword);

}
