package in.cg.beans;

public class Person {
	private int id;
	private String name,gender;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString()
	{
		return "Person Details\n"+
				"----------------\n"+
				"ID: "+getId()+"\n"+
				"Name: "+getName()+"\n"+
				"Gender: "+getGender()+"\n"+
				getAddress();
	}
}
