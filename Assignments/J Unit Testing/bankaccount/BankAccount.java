package com.bankaccount;

public class BankAccount {
	double balance = 10000;
	public boolean deposit(double amount)
	throws NegativeDepositException
	{
		if(amount<=0)
			throw new NegativeDepositException();
		balance += amount;
		return true;
	}
	public boolean withdraw(double amount)
	throws InvalidAmountException,InsufficientFundsException
	{
		if(amount<=0)
			throw new InvalidAmountException();
		if(amount>balance)
			throw new InsufficientFundsException();
		balance -= amount;
		return true;
	}
}
