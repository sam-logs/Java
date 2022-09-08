package com.dsa;

import java.util.Scanner;

public class PrintStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();

		//		System.out.println("Enter an element: ");
		//		stack.push(sc.nextInt());
		stack.push(40);
		stack.push(10);
		stack.push(30);
		stack.push(20);
		stack.pop();

		stack.display();

	}

}
