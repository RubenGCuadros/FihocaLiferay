package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.aspectos.annotations");
		annotationContext.refresh();
		
		Compra compra = annotationContext.getBean(Compra.class);
		try {
			System.out.println("Invocamos sin problemas");
			compra.compra(false);
			
		} catch (Exception e) {
			System.out.println("Obtenemos la excepci�n " + e);
		}
		
		annotationContext.close();
		
		
	}

}
