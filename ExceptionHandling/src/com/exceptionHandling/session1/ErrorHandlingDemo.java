package com.exceptionHandling.session1;

import java.util.Scanner;

public class ErrorHandlingDemo {
	Scanner sc = new Scanner(System.in);
	public void findQuotient() {
		try {
			System.out.println("Enter num1: ");
			int a = sc.nextInt();
			System.out.println("Enter num2: ");
			int b = sc.nextInt();
			int res = a/b;
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println(" DivideByZeroException");
			e.printStackTrace();
		}finally {
			System.out.println("inside finally block");
		}

	}

}
