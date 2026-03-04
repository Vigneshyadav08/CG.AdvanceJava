package in.cg.main.dto;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class EmpDTO {
	private int empId;
	@NotBlank(message="name should not be empty")
	private String empName;
	
	@Email
	@NotBlank(message = "email is required")
	private String email;
	
	@NotBlank(message = "designation is required")
	private String designation;
	
	@NotBlank(message = "house No is required")
	private String houseNo;
	
	@NotBlank(message = "city is required")
	private String city;
	
	@Column(nullable = false)
	private double salary;
	
	@Column(nullable = false)
	private int pincode;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
