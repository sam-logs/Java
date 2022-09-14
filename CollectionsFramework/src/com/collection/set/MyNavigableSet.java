package com.collection.set;
import java.util.*;

public class MyNavigableSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Book> nSet = new TreeSet<Book>();
		Book book1 = new Book(101,"The Great Gatsby","F.Scott",120);
		Book book2 = new Book(103,"Jane Eye","Charlotte",220);
		Book book3 = new Book(102,"Pride and Prejudice","Jane Austin",520);
		Book book4 = new Book(104,"The Sun also rises","Ernest",90);
		Book book5 = new Book(106,"Adventures of Huckleberr","Mark Twain",620);
		Book book6 = new Book(105,"Odessy","Heymr",250);

		nSet.add(book1);
		nSet.add(book2);
		nSet.add(book3);
		nSet.add(book4);
		nSet.add(book5);
		nSet.add(book6);
		//		for(Book obj:nSet) {
		//			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		//		}
		//		
		nSet.forEach(obj ->{
			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		});

		System.out.println("\n removing particular record");

		nSet.remove(book4);     
		nSet.forEach(obj ->{
			System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
		});
		System.out.println("\nreverse order");
		NavigableSet<Book> reverseNs = nSet.descendingSet();
		for(Book obj:reverseNs) {
						System.out.println(obj.getbId()+" "+obj.getAuthor()+" "+obj.getName()+" "+obj.getPrice());
					}

	}

}
