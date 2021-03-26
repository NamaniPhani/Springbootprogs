package com.transaction.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.transaction.example.domain.Employee;
import com.transaction.example.domain.HealthInsurance;
import com.transaction.example.service.OrganizationService;

@SpringBootApplication
public class SpringTransactionApplication implements CommandLineRunner{

	
	@Autowired
	private OrganizationService orgService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee=new Employee();
		employee.setEmpName("Sunil");
		employee.setSalary(40000);
		
		HealthInsurance insurance=new HealthInsurance();
		insurance.setInsuranceName("ICICI");
		insurance.setPremium(4000);
		
		orgService.joinOrganization(employee, insurance);
		
		
		
	}

}
