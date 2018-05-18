package com.privalia.calculatorexample.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.privalia.calculatorexample.Calculator;
import com.privalia.calculatorexample.ICalculator;

public class CalculatorTest {
	
	//Prueba SourceTree en casa
	//Polimorfismo de interfaces
	ICalculator icalculator = new Calculator();
	
	@Test
	public void sumaTest() {
		assertTrue(icalculator.add(2,2)==4);
	}
	
	@Test
	public void restaTest() {
		assertTrue(icalculator.substract(2,2)==0);
	}
	
	@Test
	public void multiplicacionTest() {
		assertTrue(icalculator.multiply(2,2)==4);
	}
	
	@Test
	public void divisionTest() {
		assertTrue(icalculator.divide(2,2)==1);
	}

}
