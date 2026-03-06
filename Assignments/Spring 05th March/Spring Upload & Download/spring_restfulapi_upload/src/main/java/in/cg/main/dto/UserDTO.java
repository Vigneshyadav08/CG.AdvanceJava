package in.cg.main.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

public class UserDTO {
	private int id;
	
	@NotBlank(message = "Name is required")
	@Size(min=4,max=30)
	private String name;
	
	@Email
	@Column(unique = true)
	@NotBlank(message="Email is required")
	private String email;
	
	@NotBlank(message = "city is required")
	private String city;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
