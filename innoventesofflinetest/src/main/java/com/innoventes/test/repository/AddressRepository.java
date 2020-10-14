package com.innoventes.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.innoventes.test.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long>{

}
