package com.privalia.entitiy.listas.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.entitiy.listas.annotations");
		annotationContext.refresh();
		
		Student student = annotationContext.getBean(Student.class);
		
		System.out.println(student.toString());						
		
		annotationContext.close();

	}
	
}
