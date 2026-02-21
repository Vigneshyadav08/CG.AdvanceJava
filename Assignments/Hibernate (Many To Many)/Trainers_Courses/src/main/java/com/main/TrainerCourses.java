package com.main;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
import com.cg.entities.*;

public class TrainerCourses {
	static Configuration cfg = new Configuration().configure("/in/cg/config/hibernate.cfg.xml");
	static SessionFactory sf = cfg.buildSessionFactory();
	static Session s = sf.openSession();
	static Transaction t;
	
	public void create()
	{
		t = s.beginTransaction();
		
		Trainer trainer = new Trainer();
		trainer.setName("Sai");
		
		Courses c1 = new Courses();
		c1.setName("Java");
		Courses c2 = new Courses();
		c2.setName("Python");
		
		trainer.setCourses(Arrays.asList(c1,c2));
		
		try {
		s.persist(trainer);
		}catch(Exception e)
		{
			System.out.println("Already exists");
		}
		t.commit();
	}
}
