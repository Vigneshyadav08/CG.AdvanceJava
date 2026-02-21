package com.palindrome;

public class Palindrome {
	public boolean isPalindrome(String str)
	{
		return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	}
	 
	public void isPalindrome(int i) throws IllegalArgumentException
	{
		throw new IllegalArgumentException();
	}
}
