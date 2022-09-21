package com.company.bean;

import java.util.*;

public class IntermediateOperations {
	public static void main(String[] args) {
		List<LaptopProducts> list = new ArrayList<LaptopProducts>();
		list.add(new LaptopProducts("HP",101,45000.00));
		list.add(new LaptopProducts("Dell",102,70000.00));
		list.add(new LaptopProducts("Acer",104,98000.00));
		list.add(new LaptopProducts("Asus",103,90000.00));
		list.add(new LaptopProducts("Lenevo",105,30000.00));
		list.add(new LaptopProducts("Alienware",106,250000.00));
		
		list.stream()
		.filter(laptop -> laptop.getPrice() > 50000)  // using filter for price 
		.map(price -> price.getPrice())  //fetching from map
		.sorted() //sorting using comparable
		.limit(2)
		.forEach(laptop -> System.out.println(laptop.toString())); //displaying using for each
		
		
		
	}

}
