package com.devapp.todo_app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.devapp.todo_app.model.Employee;
import com.devapp.todo_app.repo.EmployeeRepo;

@Service
@ComponentScan(basePackages = {"com.devapp.model", "com.devapp.repo"})
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getAllEmployee() {
		List<Employee> employee = new ArrayList<>();
		employeeRepo.findAll().forEach(employee :: add);
		return employee;
	}

	public Optional<Employee> getEmployee(Long id) {
		return employeeRepo.findById(id);
		
	}

	public void setEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	public void updateEmployee(Long id, Employee employee) {
		employeeRepo.save(employee);		
	}
	
}
