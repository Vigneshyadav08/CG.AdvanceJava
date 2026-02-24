package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.cg.beans.*;

@Configuration
public class JavaConfigFile {
	
	@Bean("address")
	public Address address()
	{
		Address a = new Address();
		a.setCity("Visakhapatnam");
		a.sethNo(5816);
		a.setPincode(530009);
		return a;
	}

	@Bean("student1")
	public Student student()
	{
		Student s = new Student();
		s.setId(1001);
		s.setName("Sujith");
		s.setEmail("sujith@gmail.com");
		s.setAddress(address());
		return s;
	}
}
