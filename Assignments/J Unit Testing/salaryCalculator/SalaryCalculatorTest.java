package com.salaryCalculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryCalculatorTest {
	static SalaryCalculator sc = new SalaryCalculator();
	@Test
	public void normalSalary()
	{
		assertEquals(53000,sc.calculateSalary(50000,5000,2000));
	}
	@Test
	public void zeroBonus()
	{
		assertEquals(38000,sc.calculateSalary(40000,0, 2000));
	}
	@Test
	public void highTax()
	{
		assertEquals(4000,sc.calculateSalary(30000,2000, 28000));
	}
	@Test
	public void negativeBasicSalary()
	{
		assertThrows(IllegalArgumentException.class,() -> sc.calculateSalary(-10000, 0, 0));
	}
	@Test
	public void taxGreaterThanSalary()
	{
		assertThrows(IllegalArgumentException.class,()->sc.calculateSalary(20000, 0, 30000));
	}
	@Test
	public void boundaryValueCase()
	{
		assertEquals(1,sc.calculateSalary(1, 0, 0));
	}
}
