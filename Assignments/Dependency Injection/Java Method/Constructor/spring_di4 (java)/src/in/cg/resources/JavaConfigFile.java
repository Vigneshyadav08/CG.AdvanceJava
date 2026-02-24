package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.cg.beans.*;

@Configuration
public class JavaConfigFile {
	
	@Bean("address")
	public Address address()
	{
		Address a = new Address(5816,"Visakhapatnam",530009);
		return a;
	}

	@Bean("student1")
	public Student student()
	{
		Student s = new Student(1001,"Sujith","sujith@gmail.com",address());
		return s;
	}
}
