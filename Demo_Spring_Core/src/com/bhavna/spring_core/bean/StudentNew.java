package com.bhavna.spring_core.bean;

public class StudentNew {
	private int rollNo;
	private String name;
	private double salary;
	private Exam exam;

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

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public StudentNew(int rollNo, String name, double salary, Exam exam) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
		this.exam = exam;
	}

	public StudentNew() {
		super();
		
	}
	
	public StudentNew(Exam exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "StudentNew [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + ", exam=" + exam + "]";
	}

}
