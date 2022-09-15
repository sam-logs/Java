package com.exceptionHandling.session2;

import java.util.Scanner;

public class AgeCheck {
	

	public void checkAge() {
		try(Scanner sc = new Scanner(System.in)) { //try with resource
			System.out.println("Enter user age: ");
			int age = sc.nextInt();
			if (age < 19) {
				throw new InvalidAgeException("Age is less than 19!!oops");
			}else {
				System.out.println("Your age is valid!! yeahh");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
