package com.company.bean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(901, "Ram", 75000));
		list.add(new Employee(910, "jack", 45000));
		list.add(new Employee(911, "Sam", 80000));
		list.add(new Employee(903, "jade", 78000));
		list.add(new Employee(904, "wilson", 32000));

		List<Employee> names = list.stream().filter(name -> name.getName().endsWith("m")).collect(Collectors.toList());
		// .forEach(name -> System.out.println(name.getName()));
		System.out.println(names);

		// sort according to names
		System.out.println("\nSorting acc to name");
		List<Employee> sortName = list.stream()
				.sorted((p1, p2) -> ((String) p1.getName()).compareToIgnoreCase(p2.getName()))
				.collect(Collectors.toList());
		System.out.println(sortName);
		// .forEach(employee -> System.out.println(employee.getName()));

		// descending order of salary
		System.out.println("\ndescending order of salary");
		List<Employee> descSal = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(descSal);
		// .forEach(emp -> System.out.println(emp.getSalary()));

		// Total Salary
		System.out.println("\nTotal Salary");
		double totalSalary = list.stream().collect(Collectors.summingDouble(salary -> salary.getSalary()));
		System.out.println(totalSalary);

		// min and max salary
		System.out.println("\nmin and max salary");
		Employee maxSalary = list.stream().max((salary1, salary2) -> salary1.getSalary() > salary2.getSalary() ? 1 : -1)
				.get();
		System.out.println("Max salary is: " + maxSalary);

		Employee minSalary = list.stream().min((salary1, salary2) -> salary1.getSalary() > salary2.getSalary() ? 1 : -1)
				.get();
		System.out.println("Min salary is: " + minSalary);

		// Count total number of employees having salary greater than 70k
		System.out.println("\n Employees having salary greater than 70k");
		long count = list.stream().filter(salary -> salary.getSalary() > 70000).count();
		System.out.println("Count is: " + count);

	}

}
