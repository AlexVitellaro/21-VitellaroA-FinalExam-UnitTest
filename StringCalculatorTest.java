package main.java;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorTest {

	public void testAddNegativeValue() {
    	assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1,5"));
    }
    
    public void testAddValueOver1000() {
    	assertEquals(500, StringCalculator.add("250,250,1000"));
    }

}
