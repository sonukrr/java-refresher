package com.luv2code.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());

	}

}
