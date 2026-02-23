package in.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.cg.beans.*;

public class MainMethod {

	public static void main(String[] args) {
		String config_loc = "/in/cg/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
	
		Student s = (Student) context.getBean("StdId2");
		System.out.println(s);
	}

}
