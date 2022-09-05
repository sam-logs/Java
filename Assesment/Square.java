package com.assignment2;

public class Square extends Shape {
	int side;
	
	public double calculateArea() {
		return side*side;
	}
	
	public Square(int side) {
		super("Square");
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	

}
