package com.notificationservice;

public class UserNotify {
	private NotificationService ns;
	
	UserNotify(NotificationService ns)
	{
		this.ns = ns;
	}
	
	public String registerUser(String name)
	{
		return ns.sendNotification("Welcome "+name);
	}
}
