package com.cricket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your choice");
		System.out.println("Enter 1 for name of bowler and batsman of last delivery: ");
		System.out.println("Enter 2 to display runs scored in that delivery: ");
		int choice = sc.nextInt();
		if(choice == 2) {
		System.out.println("Enter runs to display: ");
		long runs = sc.nextLong();
		Delivery obj = new Delivery();
		obj.displayDeliveryDetails(runs);
		}
		else if(choice == 1) {
		System.out.println("Enter Last name of Bowler: ");
		String bowler = sc.next();
		System.out.println("Enter Last name of Batsman: ");
		String batsman = sc.next();
		
		Delivery obj = new Delivery();
		obj.displayDeliveryDetails(bowler, batsman);
		}else {
			System.out.println("Please make correct choice!!");
		}

	}

}
