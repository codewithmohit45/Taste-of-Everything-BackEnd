package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Address;
import com.app.model.Customer;
import com.app.repository.AddressRepository;
import com.app.service.AddressService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressTest {
   
	@Autowired
	private AddressService service;
	@MockBean
	private AddressRepository repository;
	
	@Test
	public void addAddress() {
		Customer customer=new Customer();
		customer.setCustomerId(1);
		Address address=new Address(1, "xyz", customer);
		when(repository.save(address)).thenReturn(address);
        assertEquals(address, service.addAddress(address));
		}
	
	@Test
	public void updateAddress() {
		Customer customer=new Customer();
		customer.setCustomerId(1);
		Address address=new Address(1, "xyz", customer);
		when(repository.save(address)).thenReturn(address);
        assertEquals(address, service.updateAddress(address));
		}
	
	@Test
	public void deleteAddress() {
		Address address=new Address();
		address.setAddressId(1);
		service.deleteAddress(address.getAddressId());
		verify(repository,times(1
				)).deleteById(address.getAddressId());
	}
}
