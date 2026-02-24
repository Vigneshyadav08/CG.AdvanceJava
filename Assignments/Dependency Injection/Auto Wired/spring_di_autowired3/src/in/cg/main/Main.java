package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cg.beans.*;
import in.cg.resources.JavaConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
		System.out.println((Student) context.getBean("student"));
	} 
}
