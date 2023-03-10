package org.lessons.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	static Calculator c;

	@BeforeAll
	static void setup() throws Exception {
		c = new Calculator();
	}

	@Test
	@DisplayName("Addition Test")
	void testAdd() {
		float sum = c.add(1.5f, 3.5f);
		assertEquals(5f, sum, "La somma deve essere 5");
	}

	@Test
	@DisplayName("Subtraction Test")
	void testSubtract() {
		float sub = c.subtract(3.5f, 1.5f);
		assertEquals(2f, sub, "Il risultato dev'essere 2");
	}

	@Test
	@DisplayName("Division Test")
	void testDivide() {
		float quo = c.divide(6f, .5f);
		assertEquals(12f, quo, "Il quoziente dev'essere 12");
	}

	@Test
	@DisplayName("Moltiplication Test")
	void testMultiply() {
		float pro = c.multiply(6f, .5f);
		assertEquals(3f, pro, "Il prodotto dev'essere 3");
	}

}
