package in.cg.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.cg.main.entities.Employee;

@Service
public interface EmployeeService {
	public boolean addEmployeeDetails(Employee e);

	public List<Employee> getAllEmployees();
	public Employee getEmployee(int id);
	public boolean updateEmployee(int id,float sal);
	public boolean deleteEmployee(int id);
}
