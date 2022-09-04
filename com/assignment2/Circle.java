package com.assignment2;

public class Circle extends Shape {
	int radius;
	
	public double calculateArea() {
		return 3.14*radius*radius;
	}
	
	public Circle(int radius, String shapeName) {
		super(shapeName);
		this.radius = radius;
	}
	public void display() {
		System.out.println("Name of Shape: "+this.shapeName);
		System.out.println("Area of Circle is = "+calculateArea());
	}

}
