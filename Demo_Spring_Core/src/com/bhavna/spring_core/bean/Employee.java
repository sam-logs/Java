package com.bhavna.spring_core.bean;

import java.util.*;

public class Employee {
	private String name;
	private double salary;
	private List<Exam> exam;

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

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", exam=" + exam + "]";
	}

}
