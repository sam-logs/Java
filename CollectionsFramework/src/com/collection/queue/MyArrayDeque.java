package com.collection.queue;
import java.util.*;

import com.collection.set.Book;

public class MyArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Book> set = new ArrayDeque<Book>();
		Book book1 = new Book(101,"The Great Gatsby","F.Scott",120);
		Book book2 = new Book(103,"Jane Eye","Charlotte",220);
		Book book3 = new Book(102,"Pride and Prejudice","Jane Austin",520);
		Book book4 = new Book(104,"The Sun also rises","Ernest",90);
		Book book5 = new Book(106,"Adventures of Huckleberr","Mark Twain",620);
		Book book6 = new Book(105,"Odessy","Heymr",250);
		
		set.offer(book1);
		set.offer(book2);
		set.offer(book3);
		set.add(book4);
		set.add(book5);
		set.offerFirst(book6);
		
		set.forEach(obj ->{
			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		});
		
		set.pollLast();
		set.pollFirst();
		System.out.println("\nAfter poll last method");
		set.forEach(obj ->{
			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		});
		
	}

}
