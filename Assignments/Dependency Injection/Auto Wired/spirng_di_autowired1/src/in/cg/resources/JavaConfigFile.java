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
	@Bean
	public Address add()
	{
		Address a1 = new Address(5816,"Vizag",530009);
		return a1;
	}
	@Bean("student1")
	public Student student()
	{
		Student s = new Student();
		s.setId(1001);
		s.setName("Sujith");
		s.setEmail("sujith@gmail.com");
		// s.setAddress(address()); -- No need of manual 
		return s;
	}
}
