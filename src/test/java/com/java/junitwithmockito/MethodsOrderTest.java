package com.java.junitwithmockito;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsOrderTest {

	//Default - Test will execute the Method by ascending order - A,B,C,D
	// So using @TestMethodOrder to customize the Orders
	
	@Order(1)
	@Test
	void testC() {
		System.out.println("C executed");
	}
	
	@Order(2)
	@Test
	void testD() {
		System.out.println("D executed");
	}
	
	@Order(3)
	@Test
	void testA() {
		System.out.println("A executed");
	}
	
	@Order(4)
	@Test
	void testB() {
		System.out.println("B executed");
	}
}
