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
		float sum = c.add(1.5f, 3.75f);
		assertEquals(5f, sum, "La somma deve essere 5");
	}

	@Test
	@DisplayName("Subtraction Test")
	void testSubtract() {
		float sub = c.subtract(3.5f, 51.5f);
		assertEquals(2f, sub, "Il risultato dev'essere 2");
	}

}
