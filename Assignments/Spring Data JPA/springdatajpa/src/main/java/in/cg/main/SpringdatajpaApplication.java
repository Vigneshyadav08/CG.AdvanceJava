package in.cg.main;
import in.cg.main.repositories.EmployeeRepository;
import in.cg.main.services.EmployeeService;
import in.cg.main.services.EmployeeSevicesCls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.cg.main.entities.Employee;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdatajpaApplication.class, args);
		EmployeeService empref = context.getBean(EmployeeSevicesCls.class);
		
		// Insert employee
		Employee e1 = new Employee();
		e1.setEmpName("Sai");
		e1.setDesignation("Developer");
		e1.setSal(600000f);
		boolean s;
		s = empref.addEmployeeDetails(e1);
		if(s)
			System.out.println("Employee details added");
		else 
			System.out.println("Employee details not added");
		
		// Retrieve all records
		List<Employee> employees = empref.getAllEmployees();
		for(Employee emp:employees)
		{
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getDesignation()+" "+emp.getSal());
		}
		
		// Retrive Employee
		Employee emp  = empref.getEmployee(2);
		System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getDesignation()+" "+emp.getSal());
		
		// Update Employee
		s = empref.updateEmployee(3,750000f);
		if(s)
			System.out.println("employee details updated");
		else
			System.out.println("employee details not updated");
		
		// Delete Employee
		s = empref.deleteEmployee(4);
		if(s)
			System.out.println("Employee deleted");
		else
			System.out.println("employee not deleted");
	}

}
