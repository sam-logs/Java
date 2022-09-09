package com.sorting;

public class InsertionSort {
	public void sort(int [] arr) {
		for(int k=1; k<arr.length-1; k++)   {  
	        int temp = arr[k];  
	        int j= k-1;  						//tc- o(n^2)
	        while(j>=0 && temp <= arr[j])   {  
	            arr[j+1] = arr[j];   
	            j = j-1;  
	        }  
	        arr[j+1] = temp;  
	    }  
	}
	
	void display(int[] arr) {
		int n = arr.length;
		for (int i=0; i<n; ++i)
		System.out.print(arr[i]+" ");
		System.out.println();
	}

}
