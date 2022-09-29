package com.bhavna.spring_core.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.spring_core.bean.StudentNew;

public class TestSpringCoreInnerBean {
	public static void main(String[] args) {
		System.out.println("Using Inner Bean and Singleton Scope");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationStudentNew.xml");
		StudentNew student = (StudentNew) context.getBean("StudentNewObj");
		System.out.println(student);
		((ClassPathXmlApplicationContext) context).close();
	}

}
