package com.devapp.todo_app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private Long id;
	private String emp_name;
	private String emp_org;
	private String emp_address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_org() {
		return emp_org;
	}
	public void setEmp_org(String emp_org) {
		this.emp_org = emp_org;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", emp_org=" + emp_org + ", emp_address=" + emp_address
				+ "]";
	}
	
	
}
