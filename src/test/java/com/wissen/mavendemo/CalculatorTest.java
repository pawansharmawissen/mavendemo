package com.wissen.mavendemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {

	@BeforeAll
	public static void startTest() {
		System.out.println("=====Begin Test=====");
	}
	
	@AfterAll
	public static void endTest() {
		System.out.println("=====End Test=====");
	}
	
	@BeforeEach
	void startTestCase() {
		System.out.println("**Begin test case**");
	}
	
	@AfterEach
	void endTestCase() {
		System.out.println("**End test case**");
	}
	
	
	@Test
	void test() {
		
		assumeTrue(true);
		
		System.out.println("Demo");
	}

	@Test
	@DisplayName("Addition test case")
	void testAdd() {
		
		Calculator c = new Calculator();
		
		int a = 10;
		int b = 20;
		
		assertEquals(30, c.add(a, b), "add() failed for a: "+a+",b: "+b);
		System.out.println("Addition test passed");
		
	}
	
	@Test
	@DisplayName("Division test case")
	void testDiv() {
		
		Calculator c = new Calculator();
		
		assertThrows(ArithmeticException.class, ()->c.div(12, 0));
		
		System.out.println("Division test passed");
		
	}
	
	@Test
	@DisplayName("Subtraction test case")
	void testSub() {
		
		Calculator c = new Calculator();
		
		assertEquals(10, c.sub(20, 10));
		
		System.out.println("Subtraction test passed");
		
	}
	
	@Test
	@DisplayName("Multiplication test case")
	void testMul() {
		
		Calculator c = new Calculator();
		
		assertEquals(200, c.multiply(10, 20));
		
		System.out.println("Multiplication test passed");
		
	}
	
	@Test
	@EnabledOnOs(value = OS.LINUX)
	void testLinux() {
		
		System.out.println("Test case of Linux");
		
	}
	
	@Test
	@EnabledOnOs(value = OS.WINDOWS)
	@EnabledOnJre(value = JRE.JAVA_9)
	void testWindows() {
		
		System.out.println("Test case of Windows");
		
	}
	
	@Test
	void testAddNum() {
		
		Calculator c = mock(Calculator.class);
		
		int num = 10;
		
		doNothing().when(c).addInList(num);
		
		c.addInList(num);
		
		verify(c, times(2)).addInList(num);
		
	}
	
}
