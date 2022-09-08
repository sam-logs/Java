package com.dsa;

public class PrintQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue obj = new Queue();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		obj.dequeue();
		
		obj.display();

	}

}
