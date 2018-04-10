package com.privalia.entitiy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student = (Student) context.getBean("student");		
		
		System.out.println(student.toString());
		
		
		Student studentConstructor = (Student) context.getBean("studentConstructor");
			
		System.out.println(studentConstructor.toString());
		
		context.close();

	}

}
