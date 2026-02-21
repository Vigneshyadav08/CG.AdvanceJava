package com.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFactorial {
	@Test
	public void test()
	{
		Factorial f = new Factorial();
		assertEquals(120,f.factorialOf(5));
	}
}
