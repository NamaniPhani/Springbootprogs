package com.transaction.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.example.domain.Employee;

@Repository
public interface EmployeeDao extends  JpaRepository<Employee, Integer>{

}
