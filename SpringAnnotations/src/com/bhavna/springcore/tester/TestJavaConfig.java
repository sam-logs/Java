package com.bhavna.springcore.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhavna.springcore.bean.Student;

public class TestJavaConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
		         new AnnotationConfigApplicationContext("com/bhavna/springcore/bean/Student.class");
		Student stud = (Student) context.getBean("com/bhavna/springcore/bean/Buyer.class");
		

	}

}
