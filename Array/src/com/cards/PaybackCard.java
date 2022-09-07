package com.cards;

public class PaybackCard extends Card {
	
	private int pointsEarned;
	private double totalAmount;
	//getters and setters
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	//constructor
	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		// TODO Auto-generated constructor stub
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	//display method
	public void show() {
		System.out.println(holderName + " | " + cardNumber + " | " + expiryDate + " | " + pointsEarned + " | " + totalAmount);
	}
}
