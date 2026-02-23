package in.cg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.cg.beans") // Scans the entire location 
// search for classes having @Component
public class JavaConfigFile {
	
}
