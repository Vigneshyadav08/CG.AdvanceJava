package in.cg.resources;

import org.springframework.context.annotation.*;
import in.cg.beans.*;

@Configuration
public class JavaConfigFile {
	@Bean("person1")
	public Person person()
	{
		Person p = new Person();
		p.setId(1001);
		p.setName("Sujith");
		p.setGender("Male");
		Address address = new Address();
		address.setCity("Visakhapatnam");
		address.setPincode(530001);
		address.setState("Andhra Pradesh");
		p.setAddress(address);
		return p;
	}
	@Bean("person2")
	public Person p()
	{
		Person p = new Person();
		p.setId(1002);
		p.setName("Vignesh");
		p.setGender("Male");
		Address address = new Address();
		address.setCity("Visakhapatnam");
		address.setPincode(530008);
		address.setState("Andhra Pradesh");
		p.setAddress(address);
		return p;
	}
}
