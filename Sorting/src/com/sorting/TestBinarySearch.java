package com.sorting;

import java.util.Scanner;

public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch obj = new BinarySearch();
		int [] arr = {10,30,45,60,78,90,110,180,195};
		int n = arr.length;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Element to be searched: ");
		int element = sc.nextInt();
		
		int search = obj.binarySearch(arr, element, 0, n-1);
		if (search == -1)
			System.out.println("Element Not Found");
		else
			System.out.println("Element found at: "+search);

	}

}
