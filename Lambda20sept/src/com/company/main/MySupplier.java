package com.company.main;

import java.util.*;
import java.util.function.Supplier;

public class MySupplier {
	private static void printNames(Supplier<String> supplier) {
		System.out.println(supplier.get());

	}
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Lucifer");
		names.add("Sam");

		names.stream().forEach((item) -> {
			printNames(() -> item);
		});
	}

	

}
