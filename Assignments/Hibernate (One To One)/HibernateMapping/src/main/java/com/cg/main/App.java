package com.cg.main;

/**
 * Hello world!
 *
 */
import com.cg.entities.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("/in/cg/config/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t;
        
        // Insert
        t = s.beginTransaction();
        Profile profile = new Profile("bhAAi25");
        User user = new User("Arjuna",profile);
        profile.setUser(user);
        try {
        	s.save(user);
        	s.save(profile);
        	t.commit();
        	
        }catch(Exception e)
        {
        	System.out.println("Data is already exists");
        }
        
        
    }
}
