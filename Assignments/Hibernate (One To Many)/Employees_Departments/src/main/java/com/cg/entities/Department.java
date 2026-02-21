package com.cg.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "departments")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	List<Employee> employees = new ArrayList<>();

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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployees(Employee employee) {
		employees.add(employee);
		employee.setDepartment(this);
	}
	
	
}
