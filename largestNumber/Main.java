package largestNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a =sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b =sc.nextInt();
		System.out.println("Enter Third Number: ");
		int c =sc.nextInt();
		int largest ,temp;
		temp = a>b?a:b;
		largest = c>temp?c:temp;
		System.out.println("Largest among three is: " +largest);


	}

}
