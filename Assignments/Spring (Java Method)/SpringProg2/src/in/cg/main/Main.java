package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.beans.*;
import in.cg.resources.SpringJavaConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfigFile.class);
		
		Student s1 = (Student) context.getBean("StdId1",Student.class);
		Student s2 = (Student) context.getBean("student2",Student.class);
		System.out.println(s1);
		System.out.println();
		System.out.println(s2);
		
	}
}
