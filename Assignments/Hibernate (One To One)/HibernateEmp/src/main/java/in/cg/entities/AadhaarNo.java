package in.cg.entities;

import javax.persistence.*;

@Entity
@Table(name = "aadhaar_no")
public class AadhaarNo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long number;
	
	public AadhaarNo() {
		// TODO Auto-generated constructor stub
	}

	public void setNumber(long number)
	{
		this.number = number;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public long getNumber()
	{
		return number;
	}
}
