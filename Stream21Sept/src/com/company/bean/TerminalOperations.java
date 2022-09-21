package com.company.bean;

import java.util.ArrayList;
import java.util.List;

public class TerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(901,"Ram",75000));
		list.add(new Employee(910,"jack",45000));
		list.add(new Employee(911,"Sam",80000));
		list.add(new Employee(903,"jade",78000));
		list.add(new Employee(904,"wilson",32000));
		
		long emp = list.stream()
		.filter(name -> name.getName().endsWith("m"))
		.count();
		System.out.println(emp);
		
		
		
	}

}
