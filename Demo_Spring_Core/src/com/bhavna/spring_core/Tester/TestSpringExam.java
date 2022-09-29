package com.bhavna.spring_core.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.spring_core.bean.Exam;


public class TestSpringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationExam.xml");
		Exam exam = (Exam) context.getBean("ExamObj");
		System.out.println(exam);
		
		//creating prototype of bean scope
		System.out.println("\nUsing prototype of bean scope");
		Exam exam1 = (Exam) context.getBean("ExamObj");
		exam1.seteId(101);
		exam1.setMarks(45);
		exam1.setName("Ram");
		System.out.println(exam1);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
