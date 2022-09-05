package com.assignment2;

public class Hexagon extends Shape {
	int side;
	
	public double calculateArea() {
		return 0;
	}
	
	public Hexagon(int side) {
		super("Hexagon");
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
