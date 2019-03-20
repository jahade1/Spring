package com.jahadenglish.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if theyre the same

		boolean same = (theCoach == alphaCoach);
		System.out.println("Are they the same: " + same);
		System.out.println("location of theCoach: " + theCoach);
		System.out.println("location of alphaCoach: " + alphaCoach);
		
		
		//close the context
		context.close();
		

	}

}
