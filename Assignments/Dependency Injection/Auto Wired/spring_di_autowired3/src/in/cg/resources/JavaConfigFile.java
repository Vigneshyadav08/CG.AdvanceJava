package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.cg.beans.*;

@Configuration
public class JavaConfigFile {
	
	@Bean("student")
	public Student student() {
		Student s = new Student();
		s.setId(1001);
		s.setName("Sujith");
		s.setEmail("sujith@gmail.com");
		// s.setAddress(address()); -- No need of manual
		return s;
	}
	
	@Bean("address")
	public Address address() {
		Address a = new Address();
		a.sethNo(5816);
		a.setCity("Visakhapatnam");
		a.setPincode(530009);
		return a;
	}

	@Bean("address2")
	public Address add() {
		Address a1 = new Address();
		a1.sethNo(5816);
		a1.setCity("Vizag");
		a1.setPincode(530008);
		return a1;
	}
}
