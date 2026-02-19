package com.userservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestUserService {
	@Test
	public void test() throws WeakPasswordException, InvalidUserException
	{
		UserService user = new UserService();
		assertTrue(user.registerUser("Vignesh","vigu12345"));
		assertThrows(InvalidUserException.class,() -> 
						user.registerUser("","Vigne1111"));
		assertThrows(WeakPasswordException.class,() ->
						user.registerUser("Vignesh","1234"));
		
	}
}
