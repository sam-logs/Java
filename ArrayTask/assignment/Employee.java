package com.assignment;

public class Employee extends Person{
	private int eid;
	private String company;
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("EID= "+eid +"Company= "+company +"Salary= "+salary +"Name ="+Pname +"Address= "+address +"Age= "+age);
	}

}
