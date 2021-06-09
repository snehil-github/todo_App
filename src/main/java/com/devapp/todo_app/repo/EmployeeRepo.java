package com.devapp.todo_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devapp.todo_app.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
