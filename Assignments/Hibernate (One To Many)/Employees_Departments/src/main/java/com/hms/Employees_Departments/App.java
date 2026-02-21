package com.hms.Employees_Departments;

import org.hibernate.*;
import org.hibernate.cfg.*;
import com.cg.entities.*;
public class App 
{
    public static void main( String[] args )
    {
    		Configuration cfg = new Configuration().configure("/in/cg/config/hibernate.cfg.xml");
    		SessionFactory sf = cfg.buildSessionFactory();
    		Session s = sf.openSession();
    		Transaction t = s.beginTransaction();
    		
    		Department dept = new Department();
    		dept.setName("IT");
    		
    		Employee emp1 = new Employee();
    		emp1.setName("Sai");
    		Employee emp2 = new Employee();
    		emp2.setName("Sujith");
    		
    		dept.addEmployees(emp1);
    		dept.addEmployees(emp2);
    		
    		s.persist(dept);
    		t.commit();
    }
}
