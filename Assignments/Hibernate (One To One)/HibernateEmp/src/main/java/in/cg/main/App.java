package in.cg.main;

import org.hibernate.*;
import org.hibernate.cfg.*;

import in.cg.entities.*;

public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * 
        Admin app = new Admin();
        // Creation
        int i = 1;
        while(i<=6)
        {
        	app.insertStudent(new Student(i,"Vignesh","Male","vignesh@gmail.com"));
        	i++;
        }
        
        // Update
        app.updateStudent(new Student(2,"Sujith","Male","sujith@gmail.com"));
        app.updateStudent(new Student(3,"Sree","Female","sree@gmail.com"));
        app.updateStudent(new Student(4,"Hanshitha","Female","hanshitha@gmail.com"));
        app.updateStudent(new Student(5,"Sai","Male","sai@gmail.com"));
        
        // Fetch
        app.fetchStudent(2);
        
        // Delete
        app.deleteStudent(6);
        */
    	
    	Configuration cfg = new Configuration().configure("/in/cg/config/hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t;
        
        //
        t = s.beginTransaction();
        /*AadhaarNo aNo = new AadhaarNo();
        aNo.setNumber(123456788);
        s.saveOrUpdate(aNo);
        
        Person p = new Person();
        p.setAadhar(aNo);
        p.setName("Sai");
        s.saveOrUpdate(p);
        t.commit();
        */
        Person u = s.get(Person.class,5);
        System.out.println(u.getAadhaar().getNumber());
        
    }
}
