package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesAnnotationsApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach1 = context.getBean("tennisCoach", Coach.class);
		Coach myCoach2 = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(myCoach1 == myCoach2);

		context.close();
	}

}
