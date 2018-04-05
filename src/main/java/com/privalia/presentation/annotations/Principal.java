package com.privalia.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		HelloWorld helloWorld = (HelloWorld)appContext.getBean("helloWorld");
		
		System.out.println(helloWorld.getHello());
		
		appContext.close();
		
		
	}

}
