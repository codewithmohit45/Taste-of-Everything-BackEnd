package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.app.model.Address;
import com.app.model.Customer;
import com.app.repository.AddressRepository;
import com.app.service.AddressService;


@Service
public class AddressServiceImpl implements AddressService {
    
	@Autowired
	private AddressRepository repository;
	
	@Override
	public Address addAddress(Address address) {
		
		return repository.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		// TODO Auto-generated method stub
		return repository.save(address);
	}

	@Override
	public List<Address> getAllAddressesByCustomer(Customer customerId) {
		// TODO Auto-generated method stub
		return repository.findByCustomer(customerId);
	}

	@Override
	public List<Address> getAllAddressesByAddressId(int addressId) {
		// TODO Auto-generated method stub
		return repository.findByAddressId(addressId);
	}

	@Override
	public void deleteAddress(int addressId) {
		// TODO Auto-generated method stub
		repository.deleteById(addressId);
	}
	

}
