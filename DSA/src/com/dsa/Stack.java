package com.dsa;

public class Stack {
	Node top = null;

	public boolean empty() {
		return top == null;
	}
	//push
	public void push(int n) {
		Node node = new Node(n);
		node.next = top;
		top = node;
	}
	//pop
	public int pop() {
		if(this.empty())
			return -1;

		int container = top.data;
		top = top.next;
		return container;

	}
	//display
	public void display() {
		Node current = top;
		System.out.println("Elements in Stack are: ");
		while(current != null) {	
			System.out.println(current.data);
			current = current.next;
		}
	}

}
