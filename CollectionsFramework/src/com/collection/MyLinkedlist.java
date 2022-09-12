package com.collection;
import java.util.*;

public class MyLinkedlist {

	public static void main(String[] args) {

		  LinkedList<String> country = new LinkedList<String>(); 
		  country.add("India");
		  country.add("UK");
		  country.add("USA");
		  country.add("Russia");
		  System.out.println("Printing LinkedList");
		  Iterator itr = country.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		  
		  ArrayList<String> country1 = new ArrayList<String>();
		  country1.add("Sri lanka");
		  country1.add("Pakistan");
		  country1.add("UAE");
		  System.out.println("\nPrinting ArrayList");
		  Iterator itr1 = country1.iterator();
		  while(itr1.hasNext()) {
			  System.out.println(itr1.next());
		  }
		  
		  

	}

}
