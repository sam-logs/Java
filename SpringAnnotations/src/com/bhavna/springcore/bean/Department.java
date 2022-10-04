package com.bhavna.springcore.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("deptWorker")
public class Department {
	private int deptId;
	private Student student;
	private List<String> workers = new ArrayList<>();
	private Map<String, Integer> salaryByWorkers = new HashMap<>();

	public Department() {
		workers.add("John");
		workers.add("jack");
		workers.add("Alex");
		workers.add("George");

		salaryByWorkers.put("John", 35000);
		salaryByWorkers.put("Jack", 47000);
		salaryByWorkers.put("Alex", 12000);
		salaryByWorkers.put("George", 14000);
	}

	@Value("#{deptWorker.workers[0]}")
	private String name;

	@Value("#{deptWorker.salaryByWorkers['John']}")
	private Integer salary;

	public Department(int deptId, Student student, List<String> workers, Map<String, Integer> salaryByWorkers,
			String name, Integer salary) {
		super();
		this.deptId = deptId;
		this.student = student;
		this.workers = workers;
		this.salaryByWorkers = salaryByWorkers;
		this.name = name;
		this.salary = salary;
	}

	public List<String> getWorkers() {
		return workers;
	}

	public void setWorkers(List<String> workers) {
		this.workers = workers;
	}

	public Map<String, Integer> getSalaryByWorkers() {
		return salaryByWorkers;
	}

	public void setSalaryByWorkers(Map<String, Integer> salaryByWorkers) {
		this.salaryByWorkers = salaryByWorkers;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Department(String name, int deptId, Student student) {
		super();
		this.name = name;
		this.deptId = deptId;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", student=" + student + ", workers=" + workers + ", salaryByWorkers="
				+ salaryByWorkers + ", name=" + name + ", salary=" + salary + "]";
	}

}
