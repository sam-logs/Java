package com.sorting;

public class RunSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort obj = new SelectionSort();
		System.out.println("Unsorted Array");
		int arr[] = {15, 10, 99, 53, 36};
		for(int obj1:arr) {
			System.out.print(obj1+" ");
		}
		System.out.println();
		obj.sort(arr);
		System.out.println("Sorted arrayay");
		obj.display(arr);

	}

}
