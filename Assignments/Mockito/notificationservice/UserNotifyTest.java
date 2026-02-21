package com.notificationservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserNotifyTest {
		
	@Mock
	NotificationService ns;
	
	@InjectMocks
	UserNotify un;
	
	@Test
	void shouldSendWelcome()
	{
		// Stub void method (doNothing is default, but explicit for 
		doReturn("Welcome Vignesh").when(ns).sendNotification(anyString());
		
		// Call method under test
		un.registerUser("Vignesh");
		
		assertEquals("Welcome Vignesh", un.registerUser("Vignesh"));
		assertEquals("Welcome Vignesh",un.registerUser("Vig"));
		
		
		
	}
}
