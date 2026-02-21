package com.cg.EmpHibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
import in.cg.entities.*;
public class App 
{
	static String userName = "root",password = "abc@123";
	public static boolean validateUser(String userName,String password)
	{
		return App.userName.equalsIgnoreCase(userName) && App.password.equals(password);
	}
	
	public static void authenticated()
	{
		Configuration cnf = new Configuration();
		cnf.configure("/in/cg/config/hibernate.cfg.xml");
        SessionFactory sf = cnf.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t;
        
        // CREATION
        int i = 1;
        while(i<6)
        {
        	Employee emp1 = new Employee(i,"Vikram","Male","Developer",45000);
        	s.saveOrUpdate(emp1);
        	t = s.beginTransaction();
        	t.commit();
        	i++;
        }
        
        // Display
        Transaction t1 = s.beginTransaction();
        Employee u = s.get(Employee.class, 3);
        if(u!=null)
        {
        	System.out.println(u.getId()+" "+u.getEmpName()+" "+u.getGender()+" "+u.getEmpRole()+" "+u.getSalary());
        	t1.commit();
        }
        
        //Update
        Transaction t2 = s.beginTransaction();
        s.get(Employee.class,4).setEmpName("Sai");
        t2.commit();
        
        //Delete
        Transaction t3 = s.beginTransaction();
        s.delete(s.get(Employee.class,2));
        t3.commit();
        
        Transaction t4 = s.beginTransaction();
        Employee upd = s.get(Employee.class, 3);
        upd.setEmpName("Sree");
        upd.setGender("Female");
        t4.commit();
        
	}
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("User Name: ");
    	String userN = sc.next();
    	System.out.print("Password: ");
    	String pwd = sc.next();
    	
    	if(validateUser(userN,pwd))
    	{
    		authenticated();
    	}
    	else
    		System.out.println("Invalid User");
    	sc.close();
        
    }
}
