package largestNumber;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check: ");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("Number is Positive.");
		}else if(a == 0) {
			System.out.println("Number is Zero.");
		}else {
			System.out.println("Number is Negative");
		}
	}

}
