package in.cg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("1001")
	private int id;
	@Value("sujith")
	private String name;
	@Value("sujith@gmail.com")
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString()
	{
		return "Student Details\n"+
				"----------------\n"+
				"ID: "+getId()+"\n"+
				"Name: "+getName()+"\n"+
				"Email: "+getEmail();
	}
	
}
