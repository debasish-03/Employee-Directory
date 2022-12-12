package com.dd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dd.model.Employee;


public interface EmpolyeeRepository extends JpaRepository<Employee, Long> {

}
