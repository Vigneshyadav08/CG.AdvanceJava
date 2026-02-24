package in.cg.beans;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

public class Student {
	private int id;
	private String name,email;
	
	@Autowired
	private Address address;

	@Autowired
	private List<Subject> subjects;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return "Student Details\n"+
				"-----------------\n"+
				"ID -> "+id+"\n"+
				"Name -> "+name+"\n"+
				"Email -> "+email+"\n"
				+"\nAddress\n"
				+"-------\n"+
				address+"\n"+
				"\nSubjects\n"+
				"---------\n"+
				subjects;
	}
	
}
