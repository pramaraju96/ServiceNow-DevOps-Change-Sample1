package com.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.snow.Calculator;

public class CalculatorTestJUnit {

	private static Calculator calculator;

	@BeforeClass
	public static void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void junitAdd() {
		Assert.assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void junitSubtract() {
		Assert.assertEquals(2, calculator.subtract(5, 3));
	}

	@Test
	public void junitMultiply() {
		Assert.assertEquals(15, calculator.multiply(3, 5));
	}

	@Test
	public void junitDivide() {
		Assert.assertEquals(2, calculator.divide(10, 5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void junitDivideByZero() {
		calculator.divide(10, 0);
	}

	// Add more test cases as needed
}
