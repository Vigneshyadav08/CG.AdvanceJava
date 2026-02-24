package in.cg.beans;

public class Address {
	private int hNo;
	private String city;
	private int pincode;
	
	public Address(int hNo, String city, int pincode) {
		super();
		this.hNo = hNo;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString()
	{
		return "House No -> "+hNo+"\n"
		+"City -> "+city+"\n"
		+"Pincode -> "+pincode;
	}
}
