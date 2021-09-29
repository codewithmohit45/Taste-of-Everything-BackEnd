package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Address;
import com.app.model.Customer;

public interface AddressRepository extends JpaRepository<Address, Integer>
{

	public List<Address> findByAddressId(int addressId);

	public List<Address> findByCustomer(Customer customer);

}
