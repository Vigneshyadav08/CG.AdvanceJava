package com.orderitem;

public class OrderItem {
	private PaymentGateway pg;
	
	OrderItem(PaymentGateway pg)
	{
		this.pg = pg;
	}
	
	public boolean placeOrderItem(double amount)
	{
		pg.processPayment(amount);
		return true;
	}
	
}
