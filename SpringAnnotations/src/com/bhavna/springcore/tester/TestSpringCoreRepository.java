package com.bhavna.springcore.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.springcore.dao.StudentRepo;

public class TestSpringCoreRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/ApplicationRepository.xml");

		StudentRepo student = (StudentRepo) context.getBean("StudentRepoObj");
		System.out.println(student);
		((ClassPathXmlApplicationContext)context).close();

	}

}
