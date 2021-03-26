package com.transaction.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.example.dao.InsuranceDao;
import com.transaction.example.domain.HealthInsurance;

@Service
public class HealthInsuranceService {
	
	@Autowired
	private InsuranceDao insuranceDao;
	
	
	public HealthInsurance registerInsurance(HealthInsurance insurance) {
		return insuranceDao.save(insurance);
	}

}
