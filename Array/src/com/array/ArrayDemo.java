package com.array;

public class ArrayDemo {
	int[] arr;
	
	public ArrayDemo(int[] arr) {
		this.arr=arr;
		
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
    public void sum(int[] arr) {
    	int sum = 0;
    	for(int i=0; i<arr.length;i++) {
    	sum += arr[i];
    	}
    	System.out.println("Sum of array is :"+sum);
    }
    public void sum() {
    	int even = 0, odd = 0;
    	for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0)
                even += arr[i];
            else
            	odd += arr[i];
            
        }
    	System.out.println("Even elements sum are: "+even);
    	System.out.println("Odd elements sum are: "+odd);
    }
}
