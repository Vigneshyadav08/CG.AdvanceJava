package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cg.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/cg/resources/applicationContext.xml");
		Student s = (Student) context.getBean(Student.class);
		
		s.display();
	}
}
