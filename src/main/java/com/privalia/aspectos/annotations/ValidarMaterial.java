package com.privalia.aspectos.annotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidarMaterial {
	
	@Before("execution( * com.privalia.aspectos.annotations.Comprar.compra(..) )")
	public void comprobarCantidad() {
		System.out.println("Se comprueba que es la cantidad correcta");
	}
	
	@AfterReturning("execution( * com.privalia.aspectos.annotations.Comprar.compra(..) )")
	public void empaquetar() {
		System.out.println("Se empaqueta la mercanc�a");
	}
	
	@AfterThrowing("execution( * com.privalia.aspectos.annotations.Comprar.compra(..) )")
	public void ponerReclamacion() {
		System.out.println("Se reclaman los defectos detectados");
	}

}
