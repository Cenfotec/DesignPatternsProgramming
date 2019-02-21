package test.cenfotec.katas.fbq;

import cenfotec.katas.fbq.FooBarQix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFooBarQix {
	
	@Test
	public void testReturnNumberAsString() {
		int number = 4;
		String result = FooBarQix.process(number);
		assertEquals("4", result, "Should return 4 as string");
	}
	
	@Test
	public void testDivisibleBy3() {
		int number1 = 4;
		int number2 = 3;
		int number3 = 9;
		
		String result1 = FooBarQix.process(number1);
		String result2 = FooBarQix.process(number2);
		String result3 = FooBarQix.process(number3);

		assertEquals("4", result1, "Should return the number as string");
		assertEquals("FOO", result2, "Should return FOO");
		assertEquals("FOO", result3, "Should return FOO");
	}
	
	@Test
	public void testDivisibleBy5() {
		int number1 = 5;
		int number2 = 535;
		
		String result1 = FooBarQix.process(number1);
		String result2 = FooBarQix.process(number2);
		
		assertEquals("BAR", result1, "Should return BAR");
		assertEquals("BAR", result2, "Should return BAR");
	}
	
	@Test
	public void testDivisibleBy7() {
		int number1 = 7;
		int number2 = 14;
		
		String result1 = FooBarQix.process(number1);
		String result2 = FooBarQix.process(number2);
		
		assertEquals("QIX", result1, "Should return QIX");
		assertEquals("QIX", result2, "Should return QIX");
	}

	@Test
    public void testDivisibleByTwoOrMoreTests() {
	    int number1 = 15;

	    String result1 = FooBarQix.process(number1);

	    assertEquals("FOOBAR", result1, "Should return FOOBAR");
    }
}
