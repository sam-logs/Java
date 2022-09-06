package com.assignment2;

public class Square extends Shape {
	int side;
	
	public double calculateArea() {
		return side*side;
	}
	
	public Square(int side, String shapeName) {
		super(shapeName);
		this.side = side;
	}
	public void display() {
		System.out.println("Name of Shape: "+this.shapeName);
		System.out.println("Area of Square is = "+calculateArea());
	}

}
