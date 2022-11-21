package com.luancode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean  from spring container
		 CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		 
		
		// call metthod on the bean
		 
		 System.out.println(theCoach.getDailyFortune());
		 
		 System.out.println(theCoach.getDailyWorkout());
		 
	// call our new methods to get the literal value
		 
		 System.out.println(theCoach.getEmailAdderss());
		 
		 System.out.println(theCoach.getTema());
		// cloes the context
		 context.close();
		
	}

}
