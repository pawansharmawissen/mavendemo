package com.wissen.mavendemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ICalculatorTest {

	int result;
	
	static ICalculator cal;
	
	@BeforeAll
	public static void setup() {
		cal = mock(ICalculator.class);
		when(cal.square(10)).thenReturn(100);
		System.out.println("Mock created for ICalculator");

	}
	
	@Test
	void testSquare() {
		
		assertEquals(cal.square(10), 100);
	}

}
