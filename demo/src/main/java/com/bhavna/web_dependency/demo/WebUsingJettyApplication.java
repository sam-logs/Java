package com.bhavna.web_dependency.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebUsingJettyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebUsingJettyApplication.class, args);
		System.out.println("Using Jetty Server");
	}

}
