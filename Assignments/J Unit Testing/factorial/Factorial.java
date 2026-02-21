package com.factorial;

public class Factorial {
	public int factorialOf(int num)
	{
		int fac = 1;
		while(num>0)
		{
			fac*=  (num--);
		}
		return fac;
	}
}
