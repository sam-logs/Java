package com.bhavna.spring_core.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.spring_core.bean.ExamNew;

public class TestSpringExamNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using setter injection
		System.out.println("using setter injection");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationExamNew.xml");
		ExamNew exam = (ExamNew) context.getBean("ExamObj");
		System.out.println(exam);
		((ClassPathXmlApplicationContext) context).close();
		
		System.out.println("\nusing constructor injection");
		// using constructor injection
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationExamNewConstruct.xml");
		ExamNew exam1 = (ExamNew) context1.getBean("ExamNewConst");
		System.out.println(exam1);
		((ClassPathXmlApplicationContext) context1).close();

	}

}
