package com.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import com.app.model.Employee;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {
	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepository repository;

	@Test
	public void addEmployeeTest() throws Exception {
		Employee employee = new Employee(1, "rgs@gmail.com", "root", "rgs");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.addEmployee(employee));

		employee = new Employee(2, "rgs2@gmail.com", "root2", "rgs");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.addEmployee(employee));

		employee = new Employee(3, "rgs3@gmail.com", "root3", "rgs");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.addEmployee(employee));

		employee = new Employee(4, "rgs4@gmail.com", "root4", "rgs4");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.addEmployee(employee));
	}

	@Test
	public void updateEmployeeTest() {
		Employee employee = new Employee(1, "rgs4@gmail.com", "root4", "rgs4");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.updateEmployee(employee));

		employee = new Employee(2, "rgs3@gmail.com", "root3", "rgs3");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.updateEmployee(employee));

		employee = new Employee(3, "rgs2@gmail.com", "root2", "rgs2");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.updateEmployee(employee));

		employee = new Employee(4, "rgs1@gmail.com", "root1", "rgs1");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeService.updateEmployee(employee));
	}

	@Test
	public void getEmployeeTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Employee(12, "rgs12@gmail.com", "root12", "rgs12"),
				new Employee(13, "rgs13@gmail.com", "root13", "rgs13")).collect(Collectors.toList()));
		assertEquals(2, employeeService.getAllEmployees().size());
	}

	public void deleteCustomerTest() {
		Employee employee = new Employee();
		employee.setEmployeeId(1);
		employeeService.deleteEmployeeById(employee.getEmployeeId());
		verify(repository, times(1)).deleteById(employee.getEmployeeId());
	}

	@Test
	void contextLoads() {
	}

}
