package com.bhavna.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhavna.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Integer>{

}
