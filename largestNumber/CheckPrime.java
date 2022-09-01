package largestNumber;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check: ");
		int a = sc.nextInt();
		int m=0, flag=0;
		m = a/2;
		if(a==0 || a==1) {
			System.out.println(a+"is not a prime.");
		}else {
			for(int i=2; i<=m; i++) {
				if(a %i ==0) {
					System.out.println(a+"is not a prime.");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(a+" "+ "is prime.");
			}
		}

	}

}
