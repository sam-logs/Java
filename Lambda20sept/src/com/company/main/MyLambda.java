package com.company.main;

public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lambda block
		VoidInterface ref = (num1, num2) -> {
			int temp = 0;
			if (num1 > num2) {
				temp = num1;
			} else {
				temp = num2;
			}
			return temp;

		};
		System.out.println("The value is:" + ref.finder(10, 5));

	}

}
