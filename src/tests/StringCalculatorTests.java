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

}
