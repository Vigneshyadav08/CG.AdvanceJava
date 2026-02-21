package com.orderitem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestOrderITem {
	@Mock
	PaymentGateway pg;
	
	@InjectMocks
	OrderItem order;
	
	@Test
	public void testOrder()
	{
		doThrow(new IllegalArgumentException()).when(pg).processPayment(anyDouble());
		
		assertThrows(IllegalArgumentException.class,() -> order.placeOrderItem(-1));
		verify(pg,atLeast(1)).processPayment(anyDouble());
	}
}
