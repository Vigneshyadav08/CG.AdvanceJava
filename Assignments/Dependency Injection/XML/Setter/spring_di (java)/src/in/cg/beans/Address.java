package in.cg.beans;

public class Address {
	private int hNo;
	private String city;
	private int pincode;
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public void display()
	{
		System.out.println("House No -> "+hNo);
		System.out.println("City -> "+city);
		System.out.println("Pincode -> "+pincode);
	}
}
