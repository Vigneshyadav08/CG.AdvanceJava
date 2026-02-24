package in.cg.beans;

public class Student {
	private int id;
	private String name,email;
	private Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("Student Details\n"+
				"-----------------\n"+
				"ID -> "+id+"\n"+
				"Name -> "+name+"\n"+
				"Email -> "+email);
		address.display();
	}
	
}
