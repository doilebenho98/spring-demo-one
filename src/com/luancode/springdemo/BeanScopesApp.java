package com.luancode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanScopes-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// Check if they are the same

		boolean result = (theCoach == alphaCoach);

		// print out the result

		System.out.println("\nPointing to the same object:" + result);

		System.out.println("\nMemory loaction for theCode:" + theCoach);

		System.out.println("\nMemory loaction for alphaCoach:" + alphaCoach);

		
		
		// Close the context
		context.close();

	}

}
