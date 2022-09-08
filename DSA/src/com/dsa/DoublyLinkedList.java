package com.dsa;

public class DoublyLinkedList {
	class Node{
		String data;
		Node prev;
		Node next;
		
		public Node(String data) {
			this.data = data;
		}
	}
		
		Node head = null;
		Node tail = null;
		
		//adding node in list
		public void addNode(String data) {
			Node node = new Node(data);
			
			if(head == null) {
				head = node;
				tail = node;
				
				head.prev = null;
				tail.next = null;
			}
			else {
				tail.next = node;
				node.prev = tail;
				tail = node;
				tail.next = null;
			}
		}
		public void show() {
			Node current = head;
			if(head == null) {
				System.out.println("List is Empty!");
			}
			System.out.println("Doubly linked list elements are: ");
			while(current != null) {
				System.out.println(current.data );
				current = current.next;
			}
		}
		
	}


