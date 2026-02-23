package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.cg.beans.Student;

@Configuration
public class SpringJavaConfigFile {
	
	@Bean
	public Student StdId1()
	{
		Student s1 = new Student();
		s1.setId(1001);
		s1.setName("Sujith");
		s1.setEmail("sujith@gmail.com");
		return s1;
	}
	
	@Bean("student2")
	public Student StdId2()
	{
		Student s2 = new Student();
		s2.setId(1002);
		s2.setName("Vignesh");
		s2.setEmail("vignesh@gmail.com");
		return s2;
	}
	
}
