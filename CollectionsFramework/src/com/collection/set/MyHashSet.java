package com.collection.set;
import java.util.*;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> set=new HashSet<Book>(); 
		Book book1 = new Book(101,"The Great Gatsby","F.Scott",120);
		Book book2 = new Book(103,"Jane Eye","Charlotte",220);
		Book book3 = new Book(102,"Pride and Prejudice","Jane Austin",520);
		Book book4 = new Book(104,"The Sun also rises","Ernest",90);
		Book book5 = new Book(106,"Adventures of Huckleberr","Mark Twain",620);
		Book book6 = new Book(105,"Odessy","Heymr",250);
		
		set.add(book1);
		set.add(book2);
		set.add(book3);
		set.add(book4);
		set.add(book5);
		set.add(book6);
		set.add(book4);
		
		for(Book obj:set) {
			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		}
		//sorting in descending order
		System.out.println("\nSorting in desecending order acc. to price!!");
		TreeSet<Book> tree = new TreeSet<>(set);
		//tree.forEach(null);
		for(Book obj:tree) {
			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		}
		//
		long hashValue = book4.hashCode();
		System.out.println("\n\nHash code for book4 is"+hashValue);
		

	}

}
