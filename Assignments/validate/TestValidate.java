package com.validate;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestValidate {
	
	@Test
	public void test()
	{
		LoginValidate lv = new LoginValidate();
		assertTrue(lv.validateUser("vigu","12344V"));
	}
}
