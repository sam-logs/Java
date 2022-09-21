package com.company.main;
import java.util.function.*;

public class MyConsumer {
	private static void printNames(String name) {       
        System.out.println(name);
    }
	
	public static void main(String[] args) {
		Consumer<String> consumer = MyConsumer::printNames;
        consumer.accept("C++");
        consumer.accept("Java");
        consumer.accept("Python");
        consumer.accept("Ruby");
	}
	
	
}
