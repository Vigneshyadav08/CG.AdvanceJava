package in.cg.main.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String houseNo,city;
	private int pincode;
	
	@OneToOne(mappedBy = "address")
	private Employee employee;
	public Address()
	{
		
	}
	public Address(String houseNo,String city,int pincode)
	{
		setCity(city);
		setHouseNo(houseNo);
		setPincode(pincode);
		setEmployee(employee);
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
