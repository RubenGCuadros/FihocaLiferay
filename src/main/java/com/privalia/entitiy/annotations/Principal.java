package com.privalia.entitiy.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//instanciar el objeto a traves de aplicationConfigurationContext
public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.entitiy.annotations.");
		annotationContext.refresh();
		
		Student student = annotationContext.getBean(Student.class);
		
		System.out.println(student.toString());						
		
		annotationContext.close();

	}
	
}
