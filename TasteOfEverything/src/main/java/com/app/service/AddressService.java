package com.app.service;

import java.util.List;

import com.app.model.Address;
import com.app.model.Customer;

public interface AddressService {

	
	public Address addAddress(Address address);
	public Address updateAddress(Address address);
	public List<Address> getAllAddressesByCustomer(Customer customerId);
	public List<Address> getAllAddressesByAddressId(int addressId);
	public void deleteAddress(int addressId);

	
	}





