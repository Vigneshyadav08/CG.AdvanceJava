package com.cg.entities;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String profileName;
	
	@OneToOne(mappedBy = "profile")
	private User user;
	
	public void setUser(User user)
	{
		this.user = user;
	}
	public User getUser()
	{
		return this.user;
	}
	public Profile(String profileName)
	{
		setProfile(profileName);
	}
	
	public void setProfile(String profileName)
	{
		this.profileName = profileName;
	}
	public String getProfile()
	{
		return profileName;
	}
}
