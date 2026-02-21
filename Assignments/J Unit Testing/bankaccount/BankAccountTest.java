package com.bankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
	BankAccount account;
	@Test
	public void test() throws NegativeDepositException
	{
		account = new BankAccount();
		assertTrue(account.deposit(1000));
		assertThrows(InsufficientFundsException.class,() -> account.withdraw(50000));
		assertThrows(NegativeDepositException.class,() -> account.deposit(-1000));
		assertEquals(11000,account.balance);
	}
}
