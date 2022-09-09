package com.sorting;

public class SelectionSort {
	void sort(int arr[])
	{
	int n = arr.length;
	
	for (int i = 0; i < n-1; i++)
	{
	
	int min = i;
	for (int j = i+1; j < n; j++)   //time complexity- o(n^2)
	if (arr[j] < arr[min])			//space complexity -o(1)
	min = j;
	
	int temp = arr[min];
	arr[min] = arr[i];
	arr[i] = temp;
	}
	}
	
	void display(int[] arr) {
		int n = arr.length;
		for (int i=0; i<n; ++i)
		System.out.print(arr[i]+" ");
		System.out.println();
	}

}
