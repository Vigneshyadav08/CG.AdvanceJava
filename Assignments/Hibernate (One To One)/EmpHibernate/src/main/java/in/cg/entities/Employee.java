package in.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	private int id;
	@Column
	private String empName;
	@Column
	private String gender;
	@Column
	private String empRole;
	@Column
	private double salary;
	
	public Employee(int id,String empName,String gender,String empRole,double salary)
	{
		this.setId(id);
		this.setEmpName(empName);
		this.setGender(gender);
		this.setEmpRole(empRole);
		this.setSalary(salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
