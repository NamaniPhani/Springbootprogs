package com.transaction.example.service;

import javax.management.RuntimeErrorException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.example.domain.Employee;
import com.transaction.example.domain.HealthInsurance;

@Service
@Transactional
public class OrganizationService {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private HealthInsuranceService insuranceService;
	
	public void joinOrganization(Employee employee,HealthInsurance insurance) {
		Employee emp=empService.InsertEmployee(employee);
		
		//if (emp.getEmpId()!=0) {
		//	throw new RuntimeErrorException(null, "Transaction Error");
		//}
		
		insuranceService.registerInsurance(insurance);
	}
	

}
