package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.snow.Calculator;

public class CalculatorTestTestNG {

	private static Calculator calculator;

	@BeforeClass
	public static void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void testngAdd() {
		Assert.assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void testngSubtract() {
		Assert.assertEquals(2, calculator.subtract(5, 3));
	}

	@Test
	public void testngMultiply() {
		Assert.assertEquals(15, calculator.multiply(3, 5));
	}

	@Test
	public void testngDivide() {
		Assert.assertEquals(2, calculator.divide(10, 5));
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testngDivideByZero() {
		calculator.divide(10, 0);
	}

	// Add more test cases as needed
}
