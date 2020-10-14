package com.innoventes.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.innoventes.test.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
