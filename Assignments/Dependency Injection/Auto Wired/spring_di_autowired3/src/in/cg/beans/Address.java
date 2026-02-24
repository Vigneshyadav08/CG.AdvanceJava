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

	@Override
	public String toString()
	{
		return "House No -> "+hNo+"\n"
		+"City -> "+city+"\n"
		+"Pincode -> "+pincode;
	}
}
