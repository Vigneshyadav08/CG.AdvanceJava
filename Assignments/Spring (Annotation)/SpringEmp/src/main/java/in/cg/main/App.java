package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.beans.Employee;
import in.cg.resources.JavaConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
    		
    		Employee emp = (Employee)context.getBean(Employee.class);
    		System.out.println(emp);
    }
}
