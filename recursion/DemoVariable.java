package com.recursion;

public class DemoVariable {
	private static int rateOfIntrest=10;
	private final double PI = 3.14;
	private static final int VALUE=5;
	
	public void display() {
		System.out.println("Static variable is: "+rateOfIntrest);
		System.out.println("final variable is: "+PI);
		System.out.println("Static final variable is: "+VALUE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoVariable obj = new DemoVariable();
		obj.display();

	}

}
