package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.beans.*;
import in.cg.resources.*;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
        System.out.println((Person)context.getBean("person1",Person.class));
        System.out.println();
        System.out.println((Person)context.getBean("person2",Person.class));
       
    }
}
