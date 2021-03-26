package com.transaction.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.example.domain.HealthInsurance;

@Repository
public interface InsuranceDao extends 
JpaRepository<HealthInsurance, Integer> {

}
