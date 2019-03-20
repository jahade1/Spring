package com.jahadenglish.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemo {

	public static void main(String[] args) {
		
		//Load config Java file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
