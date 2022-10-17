package com.bhavna.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bhavna.entity.EmployeeEntity;
import com.bhavna.repository.EmployeeRepository;

@Service

public class EmployeeImpl {
	@Autowired
	private EmployeeRepository repo;
	
	public String display() {
		// TODO Auto-generated method stub
		return "In Dao";

	}

	public List<EmployeeEntity> addEmployee() {
		List<EmployeeEntity> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}
	
	public void addEmp(EmployeeEntity emp)  
	{    
	repo.save(emp);  
	}

}
