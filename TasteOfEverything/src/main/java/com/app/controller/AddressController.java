package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Address;
import com.app.model.Customer;
import com.app.service.AddressService;

@RestController
@CrossOrigin
public class AddressController {

	@Autowired
	private AddressService service;
	
	@PostMapping("/address")
	public Address addAddress(@RequestBody Address address)
	{
		return service.addAddress(address);
		
	}
	
	@PutMapping("/address")
	public Address updateAddress(@RequestBody Address address)
	{
		return service.updateAddress(address);
	}
	
	@GetMapping("/address/customer/{customerId}")              ///changes made
	public List<Address> getAllAddressesByCustomer(@PathVariable Customer customerId)
     {
		return service.getAllAddressesByCustomer(customerId);
	}
	
	@GetMapping("/address/{addressId}")  // cahnges made
	public List<Address> getAllAddressesByAddressId(@PathVariable int addressId)
	{
		return service.getAllAddressesByAddressId(addressId);
	}
	
	@DeleteMapping("/address/{addressId}")
     public void deleteAddress(@PathVariable int addressId)
     {
		service.deleteAddress(addressId);
     }
}
//7. Functionality(Address)
//Controller Name : addressController
//Service Name : addressService
//Service Implimentation: adressServiceImpl
//Repository Name: adressRepository
//Address
//PostMapping("/address")
//Address addAddress(@RequestBody Address address)
//PutMapping("/address")
//Address updateAddress(@RequestBody Address address)
//GetMapping("/address/{customerId}")
//List<Address> getAllAddress()
//GetMapping("/address/{addressId}")
//List<Address> getAddressById(@PathVariable int addressId)
//DeleteMapping("/address/{addressId}")
//void deleteAddress(@PathVariable int addressId)


//
//public Address addAddress(Address address);
//public Address updateAddress(Address address);
//public List<Address> getAllAddressesByCustomerId(int customerId);
//public List<Address> getAddressesByAddressId(int addressId);
//public void deleteAddress(int addressId);