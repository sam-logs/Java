package com.bhavna.springcore.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.springcore.bean.Employee;

public class TestSpringValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationValue.xml");
		
		Employee employee = (Employee) context.getBean("empObj");
		System.out.println(employee);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
