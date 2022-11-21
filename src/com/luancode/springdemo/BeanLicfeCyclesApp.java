package com.luancode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLicfeCyclesApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		// Close the context
		context.close();

	}

}
