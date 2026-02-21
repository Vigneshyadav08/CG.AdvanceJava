package in.cg.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
	@Id
	private int id;
	private String studentName;
	private String gender;
	private String email;
	public Student(int id,String studentName,String gender,String email)
	{
		this.setId(id);
		this.setStudentName(studentName);
		this.setGender(gender);
		this.setEmail(email);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString()
	{
		return this.id+" "+this.studentName+" "+this.gender+" "+this.email;
	}
}
