package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.StringCalculator;

class StringCalculatorTests {

	public StringCalculator makeCal() {
		return new StringCalculator();
	}

	@Test
	public void Add_whenEmptyStringisPassed() {
		StringCalculator cal = makeCal();
		int res = cal.Add(" ");
		assertEquals(0, res);
	}

	@Test
	public void Add_stringWithOneInteger() {
		StringCalculator cal = makeCal();
		int res = cal.Add("2");
		assertEquals(2, res);
	}

	@Test
	public void Add_stringWithTwoIntegers() {
		StringCalculator cal = makeCal();
		int res = cal.Add("1,2,");
		assertEquals(3, res);
	}

	@Test
	public void Add_stringWithMultipleIntegers() {
		StringCalculator cal = makeCal();
		int res = cal.Add("1,2,3,4");
		assertEquals(10, res);
	}

	@Test
	public void Add_stringWithNewLineDelimiter() {
		StringCalculator cal = makeCal();
		int res = cal.Add("1\n,2,3");
		assertEquals(6, res);
	}

	@Test
	public void Add_stringWithDifferentDelimiters() {
		StringCalculator cal = makeCal();
		int res = cal.Add("//;\n1\n;2");
		assertEquals(3, res);
	}

	@Test
	public void Add_stringWithnNegativeNumbers() {
		StringCalculator cal = makeCal();
		try {
			cal.Add("-1,-2,3");
			fail("Expected Exception");
		} catch (ArithmeticException e) {
			//exception
		}
	}
	
	@Test
	public void Add_stringWithnNegativeNumbers_showsExceptionMessage() {
		StringCalculator cal = makeCal();
		try {
			cal.Add("-1,-2,-3");
			fail("Expected Exception");
		} catch (ArithmeticException e) {
			assertEquals("Negatives not allowed: [-1, -2, -3]", e.getMessage());
		}
	}
	
}
