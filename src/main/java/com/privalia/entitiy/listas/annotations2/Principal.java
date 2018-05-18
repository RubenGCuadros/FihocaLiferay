package com.privalia.entitiy.listas.annotations2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {
	
	public static void main(String[] args) {

	AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(MyConfig.class);
	
	Student student = (Student)appContext.getBean("student");
	
	System.out.println(student.toString());
	
	appContext.close();
	
	
}
	
}
