package com.sorting;

public class RunInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort obj = new InsertionSort();
		System.out.println("Unsorted Array");
		int[] arr = {10,6,15,4,1,45};
		for(int obj1:arr) {
			System.out.print(obj1+" ");
		}
		System.out.println();
		obj.sort(arr);
		System.out.println("Sorted arrayay");
		obj.display(arr);

	}

}
