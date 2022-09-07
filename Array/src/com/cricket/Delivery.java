package com.cricket;

public class Delivery {
	public void displayDeliveryDetails(String bowler, String batsman) {
		System.out.println("Bowler of particular delivery is: "+bowler);
		System.out.println("Batsman of particular delivery is: "+batsman);
	}
	
	public void displayDeliveryDetails(Long runs) {
		if (runs == 6) {
			System.out.println("It's a Sixer wooo!!");
		}else if(runs == 4) {
			System.out.println("It's a boundary!!!");
		}else {
			System.out.println("Runs is: "+runs);
		}
	}

}
