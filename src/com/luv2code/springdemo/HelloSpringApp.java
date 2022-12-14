package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// This class showcases the Inversion of Control principle
// by creating an object factory.
public class HelloSpringApp {

	public static void main(String[] args) {		
		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods on the bean //
		System.out.println(theCoach.getDailyWorkout());
		// close the context //
		context.close();
	}

}
