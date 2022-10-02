package com.bhavna.springcore.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.springcore.bean.Seller;

public class TestSpringComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bhavna/spring_core/resources/Application.xml");

		Seller sell = (Seller) context.getBean("sellerObj");

		System.out.println(sell);

		((ClassPathXmlApplicationContext) context).close();

	}

}
