package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.cg.beans.*;
import java.util.*;

@Configuration
public class JavaConfigFile {
	
	@Bean("address")
	public Address address()
	{
		Address a = new Address(5816,"Visakhapatnam",530009);
		return a;
	}
	@Bean
	public List<Subject> subjects()
	{
		List<Subject> subjects = new ArrayList<>();
		subjects.add(new Subject("Java Advanced"));
		subjects.add(new Subject("HTML"));
		subjects.add(new Subject("REACT"));
		subjects.add(new Subject("Docker"));
		return subjects;
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
