package com.company.bean;

public class Employee implements Comparable<Employee> {
	private int emp_id;
	private String name;
	private double salary;
	public  double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Employee(int emp_id, String name, double salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub		
		return this.name.compareTo(o.name);
	}
	
	

}
