package com.company.main;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiInterface ref;
		ref = () -> 3.14;
		
		System.out.println("Value of lambda expression is: "+ref.getPiValue());
		

	}

}
