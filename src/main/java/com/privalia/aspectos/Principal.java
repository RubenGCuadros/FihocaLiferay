package com.privalia.aspectos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Compra cp = (Compra) ctx.getBean("compra");
		
		try {
			System.out.println("Invocamos sin problemas");
			cp.compra(false);
			
		} catch (Exception e) {
			System.out.println("Obtenemos la excepción " + e);
		}
		
		ctx.close();
		
		
	}

}
