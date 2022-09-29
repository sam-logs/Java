package com.bhavna.spring_core.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.spring_core.bean.Employee;

public class TestSpringCoreEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationEmployee.xml");
		Employee employee = (Employee) context.getBean("employeeObj");
		System.out.println(employee);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
