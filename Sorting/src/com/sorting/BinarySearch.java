package com.sorting;

public class BinarySearch {
	public int binarySearch(int[] arr, int element, int low, int high) {
		if(high >= low) {
			int mid = low + (high-low)/2;
		
		if (arr[mid] == element)               //time complexity- o(log n )
											  // space complexity- o(log n)
			return mid;
		
		if(arr[mid]> element)
			return binarySearch(arr,element,low,mid-1);
		
		return binarySearch(arr,element,mid+1,high);
		
	}
		return -1;
	}
}
