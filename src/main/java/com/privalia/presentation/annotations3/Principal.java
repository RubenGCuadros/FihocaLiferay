package com.privalia.presentation.annotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationContext =
				new AnnotationConfigApplicationContext();
		
		//via reflexion obtenemos la clase
		annotationContext.scan(Principal.class.getPackage().getName());
		annotationContext.refresh();
		
		HelloWorld helloWorld = (HelloWorld)
				annotationContext.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
		
		annotationContext.close();
		
	}

}
