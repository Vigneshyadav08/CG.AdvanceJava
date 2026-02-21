package com.palindrome;

import static org.junit.Assert.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestPalindrome {
	@ParameterizedTest
	@ValueSource(strings = {
		"aba",
		"amma",
		"malayalam",
		"rajaajar"
	})
	public void test(String s)
	{
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindrome(s));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "testData.csv",numLinesToSkip=0)
	void testP(String s)
	{
		Palindrome p =new Palindrome();
		assertTrue(p.isPalindrome(s));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "test1Data.csv",numLinesToSkip=0)
	void testPalindrome(int s)
	{
		Palindrome p = new Palindrome();
		assertThrows(IllegalArgumentException.class,() -> p.isPalindrome(s));
	}
	
	
}
