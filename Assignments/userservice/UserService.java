package com.userservice;

public class UserService {
String userName,password;
	public boolean registerUser(String userName,String password)
	throws WeakPasswordException,InvalidUserException
	{
		if(password.length()<8)
			throw new WeakPasswordException();
		if(userName.equals(null) || userName.equals(""))
			throw new InvalidUserException();
		this.userName = userName;
		this.password = password;
		return true;
	}
}
