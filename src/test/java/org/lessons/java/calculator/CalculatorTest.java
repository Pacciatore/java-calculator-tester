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
		float sum = c.add(1, 3);
		assertEquals(2, sum, "La somma deve essere 2");
	}

}
