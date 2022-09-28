package com.bhavna.testframework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.bhavna.bean.Calculator;

public class TestCalculator {
	Calculator obj = new Calculator();

	@Test
	@DisplayName(value = "Addition Test for double")
	public void testAddition() {

		assertEquals(5, Calculator.addition(2, 3));
	}

	@Test
	public void testSubtraction() {
		assertEquals(3, Calculator.subtraction(5, 2));
	}

	@Test
	@DisplayName(value = "Division Test")
	public void testDivision() {
		assertEquals(2.5, Calculator.division(5, 2), 0.0);
	}

	@Test
	public void testMultiplication() {
		assertEquals(15, Calculator.multiplication(5, 3));
	}

}
