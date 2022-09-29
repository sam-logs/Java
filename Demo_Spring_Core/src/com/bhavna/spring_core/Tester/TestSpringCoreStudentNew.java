package com.bhavna.spring_core.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.spring_core.bean.StudentNew;

public class TestSpringCoreStudentNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using setter injection
		// using autowiring by name
		System.out.println("using setter injection and using autowiring by name");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationStudentNew.xml");
		StudentNew student = (StudentNew) context.getBean("StudentNewObj");
		System.out.println(student);
		((ClassPathXmlApplicationContext) context).close();

		// using constructor injection
		/*System.out.println("\nusing constructor injection");
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationStudentNewConstruct.xml");
		StudentNew student1 = (StudentNew) context1.getBean("StudentNewConst");
		System.out.println(student1);
		((ClassPathXmlApplicationContext) context1).close();
		*/
		
		System.out.println("\nusing autowiring by type");
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationStudentNew.xml");
		StudentNew student1 = (StudentNew) context1.getBean("StudentNewObj1");
		System.out.println(student1);
		((ClassPathXmlApplicationContext) context1).close();
		
		
		System.out.println("\nusing autowiring by constructor");
		ApplicationContext context2 = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationStudentNew.xml");
		StudentNew student2 = (StudentNew) context2.getBean("StudentNewObj2");
		System.out.println(student2);
		((ClassPathXmlApplicationContext) context2).close();
		
		System.out.println("\nusing autowiring by no");
		ApplicationContext context3 = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationStudentNew.xml");
		StudentNew student3 = (StudentNew) context3.getBean("StudentNewObj3");
		System.out.println(student3);
		((ClassPathXmlApplicationContext) context3).close();
	}

}
