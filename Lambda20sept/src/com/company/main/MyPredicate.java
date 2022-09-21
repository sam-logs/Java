package com.company.main;

import java.util.function.Predicate;

public class MyPredicate {
	public static void main(String[] args) {

		agePredicate(20, (age) -> age >= 18);

	}

	public static void agePredicate(int age, Predicate<Integer> ref) {
		if (ref.test(age)) {
			System.out.println("You are Eligible for voting");
		} else {
			System.out.println("Can't vote this year!");
		}

	}
}
