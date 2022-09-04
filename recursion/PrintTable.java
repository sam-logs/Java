package com.recursion;

import java.util.Scanner;

public class PrintTable {
	static void table(int n, int i) {
		if(i > 10)
			return ;
		System.out.println(n + "*"+ i+ "="+n*i);
		table(n,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number to print table: ");
		int n= sc.nextInt();
		table(n,1);

	}

}
