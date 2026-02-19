package com.validate;

public class LoginValidate {
	String name = "vigu",pwd = "12344V";
	boolean validateUser(String name,String pwd)
	{
		return this.name.equalsIgnoreCase(name) && this.pwd.equals(pwd);
	}
}
