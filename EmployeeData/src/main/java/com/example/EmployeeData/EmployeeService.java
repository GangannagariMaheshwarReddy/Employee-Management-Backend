package com.example.EmployeeData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}
	
	Employee getEmployee(int id) {
		return employeeRepo.findById(id).orElse(null);
	}
	
	public Employee save(Employee emp) {
		return employeeRepo.save(emp);
	}

	public void delete(int id) {
		employeeRepo.deleteById(id);
	}
	
	
}
