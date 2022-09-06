package com.assignment;

public class Student extends Person {
	private int rollno;
	private int std;
	private int per;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
	public void display() {
		System.out.println("Roll_no= "+rollno +"Class"+std +"Percentage= "+per +"Name ="+Pname +"Address= "+address +"Age= "+age);
	}

}
