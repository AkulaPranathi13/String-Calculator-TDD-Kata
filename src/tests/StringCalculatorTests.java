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
	public void add_twoElements_addsString() {
		StringCalculator cal = makeCal();
		int res = cal.Add("1,2");
		assertEquals(3, res);
	}
}
