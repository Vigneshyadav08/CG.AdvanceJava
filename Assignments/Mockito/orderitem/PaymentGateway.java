package com.orderitem;

public interface PaymentGateway {
	public void processPayment(double amount);
}
