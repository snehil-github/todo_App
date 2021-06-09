package com.devapp.todo_app.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.devapp.todo_app.model.Employee;
import com.devapp.todo_app.service.EmployeeService;

@RestController
public class EmpController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getMethod() {
		return "This is home page.";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Optional<Employee> getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public void setEmployee(@RequestBody Employee employee) {
		employeeService.setEmployee(employee);
	}
	
	@RequestMapping(value = "/employee/update/{id}", method = RequestMethod.PUT)
	public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		employeeService.updateEmployee(id ,employee);
	}

	
}
