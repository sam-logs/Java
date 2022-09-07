package com.cards;

public class MembershipCard extends Card {
	private int rating;
	//getters and setters
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	//constructor
	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}
	//display method
	public void show() {
		System.out.println(holderName + " | " + cardNumber + " | " + expiryDate + " | " + rating);
	}

}
