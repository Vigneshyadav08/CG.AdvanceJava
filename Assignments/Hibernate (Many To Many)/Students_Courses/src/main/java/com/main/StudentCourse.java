package com.main;

import com.cg.entities.*;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
/**
 * Hello world!
 *
 */
public class StudentCourse 
{
	static Configuration cfg = new Configuration().configure("/in/cg/config/hibernate.cfg.xml");
    static SessionFactory sf = cfg.buildSessionFactory();
    static Session s = sf.openSession();
    static Transaction t;
    
	public void create()
	{
		t = s.beginTransaction();
        
        Student student = new Student();
        
        Course course1 = new Course();
        Course course2 = new Course();
        course1.setName("JAVA");
        course2.setName("Junit");
        
        student.setName("Vignesh");
        List<Course> courses = Arrays.asList(course1,course2);
        student.setCourses(courses);
        try {
        		s.persist(student);
        }catch(Exception e)
        {
        		System.out.println("Already exists");
        }
        t.commit();
	}
}
