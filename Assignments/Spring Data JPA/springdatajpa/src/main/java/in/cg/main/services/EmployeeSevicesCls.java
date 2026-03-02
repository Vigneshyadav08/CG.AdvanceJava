package in.cg.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.main.entities.Employee;
import in.cg.main.repositories.EmployeeRepository;

@Service
public class EmployeeSevicesCls implements EmployeeService{
	
	@Autowired
	EmployeeRepository er;
	
	@Override
	public boolean addEmployeeDetails(Employee e)
	{
		try {
			er.save(e);
			return true;
		}catch(Exception exc)
		{
			exc.printStackTrace();
			return false;
		}
	}
	
	@Override
	public List<Employee> getAllEmployees()
	{
		return er.findAll();
	}
	
	@Override
	public Employee getEmployee(int id)
	{
		Optional<Employee> emp = er.findById(id);
		return emp.get();
	}

	@Override
	public boolean updateEmployee(int id,float sal) {
		Optional<Employee> emp = er.findById(id);
		Employee employee = emp.get();
		employee.setSal(sal);
		try {
			er.save(employee);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		try {
			er.delete(er.findById(id).get());
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
}	
