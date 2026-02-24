package in.cg.beans;

public class Student {
	private int id;
	private String name,email;
	private Address address;
	
	public Student(int id, String name, String email, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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
