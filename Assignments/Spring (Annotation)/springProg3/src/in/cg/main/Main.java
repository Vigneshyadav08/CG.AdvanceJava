package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cg.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_url = "/in/cg/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_url);
		
		Student s = (Student)context.getBean(Student.class);
		System.out.println(s);
	}
}
