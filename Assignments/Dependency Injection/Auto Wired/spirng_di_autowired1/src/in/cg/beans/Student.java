package in.cg.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name,email;
	
	@Autowired
	private Address address;

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
		return "\nStudent Details\n"+
				"-----------------\n"+
				"ID -> "+id+"\n"+
				"Name -> "+name+"\n"+
				"Email -> "+email+"\n"
				+"Address\n"
				+"-------\n"+
				address;
	}
	
}
