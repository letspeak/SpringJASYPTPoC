package com.san;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.san.model.UserEnvironment;

public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		UserEnvironment environment = (UserEnvironment) context.getBean("userEnv");
		System.out.println(environment.getPassword());
	}
}
