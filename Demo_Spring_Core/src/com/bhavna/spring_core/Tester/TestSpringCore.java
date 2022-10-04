package com.bhavna.spring_core.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.spring_core.bean.Student;

public class TestSpringCore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/Application.xml");
		Student student = (Student) context.getBean("StudentObj");
		System.out.println(student);
		System.out.println("List: " + student.getSchool());
		System.out.println("Set: " + student.getStandard());
		System.out.println("Map: " + student.getUid());

		((ClassPathXmlApplicationContext) context).close();

	}

}
