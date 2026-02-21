package com.cg.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "trainers")
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "trainers_courses",
			joinColumns = @JoinColumn(name = "trainer_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id")
	)
	private List<Courses> courses;

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

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	
}
