package com.innoventes.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.innoventes.test.entity.EmployeeAddress;
import com.innoventes.test.entity.EmployeeAddressId;

public interface EmployeeAddressRepository extends CrudRepository<EmployeeAddress, EmployeeAddressId>{

}
