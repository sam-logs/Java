package com.assignment2;

public class Rectangle extends Shape {
	int length;
	int breadth;
	
	public double calculateArea() {
		return length*breadth;
	}
	
	public Rectangle(int length,int breadth, String shapeName) {
		super(shapeName);
		this.length = length;
		this.breadth = breadth;
	}
	public void display() {
		System.out.println("Name of Shape: "+this.shapeName);
		System.out.println("Area of Rectangle is = "+calculateArea());
	}

}
