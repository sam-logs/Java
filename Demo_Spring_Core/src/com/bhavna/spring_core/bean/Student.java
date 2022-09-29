package com.bhavna.spring_core.bean;

import java.util.*;

public class Student {
	private int rollNo;
	private String name;
	private double salary;
	private List<String> school;
	private Map<Integer,String> uid;
	

	public Map<Integer, String> getUid() {
		return uid;
	}

	public void setUid(Map<Integer, String> uid) {
		this.uid = uid;
	}

	public Set<String> getStandard() {
		return standard;
	}

	public void setStandard(Set<String> standard) {
		this.standard = standard;
	}

	private Set<String> standard;

	public List<String> getSchool() {
		return school;
	}

	public void setSchool(List<String> school) {
		this.school = school;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Student() {
		super();
	}

	public Student(int rollNo, String name, double salary) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + "]";
	}

}
