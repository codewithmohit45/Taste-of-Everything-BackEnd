package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Address;
import com.app.model.Customer;
import com.app.model.Item;
import com.app.model.Order;
import com.app.repository.OrderRepository;

import com.app.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {
	@Autowired
	private OrderService service;
	
	@MockBean
	private OrderRepository  repository;
	
	@Test
	public void addOrderTest() throws Exception {
		Customer customer=new Customer();
		Item item=new Item();
		customer.setCustomerId(1);
		item.setItemId(1);
		Address address=new Address();
		address.setAddressId(1);
		Order order =new Order(1, "Prepared", 1, customer, item, address);
		when(repository.save(order)).thenReturn(order);
        assertEquals(order, service.addOrder(order));
		}

	@Test
	public void updateOrderTest() throws Exception{
		Customer customer=new Customer();
		Item item=new Item();
		customer.setCustomerId(1);
		item.setItemId(1);
		Address address=new Address();
		address.setAddressId(1);
		Order order =new Order(1, "Prepared", 1, customer, item, address);
		when(repository.save(order)).thenReturn(order);
        assertEquals(order, service.updateOrder(order));	
	
	
	}

    @Test
    public void getAllOrderTest() throws Exception{
    	Customer customer=new Customer();
    	customer.setCustomerId(1);
		Item item=new Item();
		item.setItemId(1);
		Address address=new Address();
		address.setAddressId(1);
		Customer customer1=new Customer();
    	customer1.setCustomerId(1);
		Item item1=new Item();
		item1.setItemId(2);
		Address address1=new Address();
		address1.setAddressId(1);
		when(repository.findAll()).thenReturn(Stream.of(new Order(1, "Prepared", 1, customer, item, address), new Order(2, "Delivered", 2, customer1, item1, address1)).collect(Collectors.toList()));
		assertEquals(2,service.getAllOrders().size());
    }

}
