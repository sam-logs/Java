package com.assignment;

public class Person {
	protected String Pname;
	protected String address;
	protected int age;
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name = "+Pname + "Address= "+address + "Age= "+age);
	}

}
