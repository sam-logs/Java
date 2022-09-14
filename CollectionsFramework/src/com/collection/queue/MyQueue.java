package com.collection.queue;
import com.collection.set.*;
import java.util.*;

public class MyQueue {
	public static void main(String[] args) {
		Queue<Book> queue=new PriorityQueue<Book>(); 
		Book book1 = new Book(101,"The Great Gatsby","F.Scott",120);
		Book book2 = new Book(103,"Jane Eye","Charlotte",220);
		Book book3 = new Book(102,"Pride and Prejudice","Jane Austin",520);
		Book book4 = new Book(104,"The Sun also rises","Ernest",90);
		Book book5 = new Book(106,"Adventures of Huckleberr","Mark Twain",620);
		Book book6 = new Book(105,"Odessy","Heymr",250);
		
		queue.add(book1);
		queue.add(book2);
		queue.add(book3);
		queue.add(book4);
		queue.add(book5);
		queue.add(book6);
		
		queue.forEach(obj ->{
			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		});
		
		System.out.println("\nDeleting one record");
		queue.remove();
		queue.forEach(obj ->{
			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		});
		
	} 
	

}
