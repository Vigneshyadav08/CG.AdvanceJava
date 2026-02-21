package in.cg.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.cg.entities.Student;

public class Admin {
	static Configuration cfg  = new Configuration().configure("/in/cg/config/hibernate.cfg.xml");
    static SessionFactory sf = cfg.buildSessionFactory();
    static Session s = sf.openSession();
    static Transaction t;
    static Student student;
    
	public void fetchStudent(int id)
	{
		t = s.beginTransaction();
		student = s.get(Student.class,id); 
		System.out.println(student);
		t.commit();
	}
	
	public void updateStudent(Student stu)
	{
		t = s.beginTransaction();
		student  = s.get(Student.class, stu.getId());
		student.setStudentName(stu.getStudentName());
		student.setEmail(stu.getEmail());
		student.setGender(stu.getGender());
		t.commit();	
	}
	
	public void deleteStudent(int id)
	{
		t = s.beginTransaction();
		s.delete(s.get(Student.class, id));
		t.commit();
	}
	
	public void insertStudent(Student stu)
	{
		t = s.beginTransaction();
		s.saveOrUpdate(stu);
		t.commit();
	}
}
