package com.recursion;

public class DemoNonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoNonRecursive obj = new DemoNonRecursive();
		obj.demo();

	}
	public void demo() {
		System.out.println("demo starts");
		demo1();
		System.out.println("demo ends");
	}
	public void demo1() {
		System.out.println("demo1 starts");
		demo2();
		System.out.println("demo1 ends");
	}
	public void demo2() {
		System.out.println("demo2 starts");
		
		System.out.println("demo2 ends");
	}
	

}
