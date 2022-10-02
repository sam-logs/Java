package com.bhavna.springcore.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.springcore.bean.Student;

public class TestSpringService {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationService.xml");

		Student student = (Student) context.getBean("studentObj");
		System.out.println(student);

		((ClassPathXmlApplicationContext) context).close();
	}

}
