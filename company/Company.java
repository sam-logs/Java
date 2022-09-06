package com.array;

public class Company {
	private int cId;
	private String name;
	private String city;
	private int turnover;
	private int numberOfEmployees;
	
	
	public Company(int cId, String name, String city, int turnover, int numberOfEmployees) {
		this.cId = cId;
		this.name = name;
		this.city = city;
		this.turnover = turnover;
		this.numberOfEmployees = numberOfEmployees;
		
		
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public void display() {
		System.out.println(cId+ " "+ name+ " "+ city+ " "+ turnover+ " "+ numberOfEmployees);
	}
}
