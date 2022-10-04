package com.bhavna.springcore.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.springcore.bean.Department;

public class TestSpringExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationExpression.xml");
		
		Department dept = (Department) context.getBean("deptWorker");
		System.out.println(dept);
		((ClassPathXmlApplicationContext)context).close();
	}

}
