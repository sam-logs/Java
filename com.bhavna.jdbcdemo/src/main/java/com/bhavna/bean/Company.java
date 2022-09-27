package com.bhavna.bean;

public class Company {
	private String company;
	private int Id; 
	private double turnover; 
	private String address;
	private String establishment;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public double getTurn_over() {
		return turnover;
	}
	public void setTurn_over(double turn_over) {
		this.turnover = turn_over;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEstablishment() {
		return establishment;
	}
	public void setEstablishment(String establishment) {
		this.establishment = establishment;
	}

	public Company( int Id,String company, double turnover, String address, String establishment) {
		this.company = company;
		this.Id = Id;
		this.turnover = turnover;
		this.address = address;
		this.establishment = establishment;
	}

}
