package in.cg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1001")
	private int id;
	@Value("Sujith")
	private String name;
	@Value("100000")
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Employee Details\n"+
				"-----------------\n"+
				"ID: "+getId()+"\n"+
				"Name: "+getName()+"\n"+
				"Salary: Rs."+getSalary();
	}
}
