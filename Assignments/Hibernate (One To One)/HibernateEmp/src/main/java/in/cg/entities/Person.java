package in.cg.entities;

import javax.persistence.*;

@Entity
@Table(name= "persons_table")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "a_id")// Foreign Key
	
	private AadhaarNo aadhar_no;
	
	public AadhaarNo getAadhaar()
	{
		return aadhar_no;
	}
	public void setAadhar(AadhaarNo aadhar_no)
	{
		this.aadhar_no = aadhar_no;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
}
