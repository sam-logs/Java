package com.cards;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Choice to see Membership or payback details");
		System.out.println("Enter 1 for MembershipCard Details: ");
		System.out.println("Enter 2 for PaybackCard Details: ");
		System.out.println("Please Enter your choice Sir! ");
		int choice = sc.nextInt();
			//membershipcard details
		if(choice == 1) {
			System.out.println("Enter CardHolder Name: ");
			String holderName = sc.next();
			System.out.println("Enter Card Number: ");
			String cardNumber = sc.next();
			System.out.println("Enter Expiry Date: ");
			String expiryDate = sc.next();
			System.out.println("Enter Rating: ");
			int rating = sc.nextInt();
			MembershipCard obj = new MembershipCard(holderName, cardNumber , expiryDate, rating);
			obj.show();
		}
		//Payback Card Details
		else if(choice == 2) {
			System.out.println("Enter CardHolder Name: ");
			String holderName = sc.next();
			System.out.println("Enter Card Number: ");
			String cardNumber = sc.next();
			System.out.println("Enter Expiry Date: ");
			String expiryDate = sc.next();
			System.out.println("Enter pointsEarned: ");
			int pointsEarned = sc.nextInt();
			System.out.println("Enter Total Amount: ");
			double totalAmount = sc.nextDouble();
			PaybackCard obj1 = new PaybackCard(holderName, cardNumber, expiryDate, pointsEarned, totalAmount);
			obj1.show();
		}
	}

}
