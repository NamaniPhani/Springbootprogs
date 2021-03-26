package com.transaction.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.example.dao.EmployeeDao;
import com.transaction.example.domain.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	public Employee InsertEmployee(Employee employee) {
		return empDao.save(employee);
	}
	

}
