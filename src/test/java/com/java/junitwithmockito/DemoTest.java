package com.java.junitwithmockito;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.java.junit.calculator.CalculatorDemo;

public class DemoTest {

	CalculatorDemo calc = new CalculatorDemo();
	@Test
	void TestDemo() {
		System.out.println("Hello JUnit");	
	}
	
	@Test
	void TestCalculator_MultiplicationDemo() {	
		int result = calc.multiplication(10, 10);
		assertEquals(100,result);	
	}
	
	@Test
	void testCalculator_DividentDemo() {
		assertThrows(ArithmeticException.class, () -> calc.dividemethod(4, 0));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Arunachalam","Sridhar","Bakkiyalakshmi","Harini",""})
	void testStringGame(String str) {
		String result = calc.StringGame(str);
		String test = null;
		assertNotNull(str);
		
	}
	
	
}
