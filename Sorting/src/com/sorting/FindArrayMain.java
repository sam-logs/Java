package com.sorting;

import java.util.Scanner;

public class FindArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,num,flag = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Array:");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter The Array Elements:\n");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();

		}
		System.out.println("Enter The Number You Want To Search:");
		num=sc.nextInt(); 
		for( i=0;i<size;i++)
		{
			if(num==a[i])
			{
				System.out.println("The Position Is:"+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Not Found");

	}

}

