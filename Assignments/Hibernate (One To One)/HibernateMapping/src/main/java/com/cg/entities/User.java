package com.cg.entities;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int User_id;
	private String userName;
	
	public User(String userName,Profile profile)
	{
		setUserName(userName);
		setProfile(profile);
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profile_id")
	private Profile profile;
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public void setProfile(Profile profile)
	{
		this.profile = profile;
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	public Profile getProfileObj()
	{
		return this.profile;
	}
}

