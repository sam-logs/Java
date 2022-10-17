package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.dao.EmployeeImpl;
import com.bhavna.entity.EmployeeEntity;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeImpl dao;

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String display() {
		String message = dao.display();
		return message;

	}
	@RequestMapping("/")    
	public List<EmployeeEntity> addAllEmployee()  
	{    
	return dao.addEmployee();
	} 
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody EmployeeEntity emp) {
		dao.addEmp(emp);
	}

}
