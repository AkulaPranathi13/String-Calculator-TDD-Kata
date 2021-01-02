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
		int res = cal.Add("1,2,3,4,5");
		assertEquals(15, res);
	}
}
