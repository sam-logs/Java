package com.dsa;

public class Queue {
	Node head;
	Node tail;
	int count;
	
	//constructor
	public Queue() {
		this.count = 0;
	}
	
	public boolean empty() {
		return this.count == 0;
	}
	
	//enqueue
	public void enqueue(int value) {
	Node node = new Node(value);
	if(this.head == null) {
		this.head = node;
	}
	else {
		this.tail.next = node;
	}
	this.count++;
	this.tail = node;
	}
	
	//dequeue
	public int dequeue() {
		if(this.head == null) {
			System.out.println("Queue is empty!");
			return -1;
		}
		Node temp = this.head;
		this.head = head.next;
		this.count--;
		if (this.head == null) {
			this.tail = null;
		}
		return temp.data;
	}
	
	//display
	public void display() {
		Node temp = head;
		System.out.println("Elements in queue are: ");
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
