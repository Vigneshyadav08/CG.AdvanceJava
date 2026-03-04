package in.cg.main.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.main.dto.EmpDTO;
import in.cg.main.entities.*;
import in.cg.main.repositories.EmployeeRepository;

@Service
public class EmpServiceCls implements EmpService
{
	@Autowired
	EmployeeRepository er;
	
	@Override
	public EmpDTO addUser(EmpDTO emp) {
		if(er.existsByEmail(emp.getEmail()))
			throw new RuntimeException("email alreadys exists");
		
		Employee employee = toEmp(emp);
		er.save(employee);
		
		emp.setEmpId(employee.getEmpId());
		return emp;
	}
	
	@Override
	public EmpDTO getEmpId(int id) {
		Employee emp = er.findById(id).get();
		return toDTO(emp);
	}
	
	@Override
	public List<EmpDTO> getAllEmp()
	{
		List<EmpDTO> employees = new ArrayList<>();
		for(Employee emp:er.findAll())
		{
			EmpDTO dto = toDTO(emp);
			employees.add(dto);
		}
		return employees;
	}
	
	@Override
	public EmpDTO updateEmp(int id,EmpDTO dto)
	{
		Employee emp = er.findById(id).get();
		if(dto.getCity()!=null)
			emp.getAddress().setCity(dto.getCity());
		if(dto.getEmpName()!=null)
			emp.setEmpName(dto.getEmpName());
		else if(dto.getEmail()!=null)
			emp.setEmail(dto.getEmail());
		else if(dto.getDesignation()!=null)
			emp.setDesignation(dto.getDesignation());
		else if(dto.getSalary()!=0)
			emp.setSalary(dto.getSalary());
		else if(dto.getPincode()!=0)
			emp.getAddress().setPincode(dto.getPincode());
		else if(dto.getHouseNo()!=null)
			emp.getAddress().setHouseNo(dto.getHouseNo());
		er.save(emp);
		return toDTO(emp);
	}
	
	@Override
	public EmpDTO deleteUser(int id)
	{
		EmpDTO dto = toDTO(er.findById(id).get());
		er.deleteById(id);
		return dto;
	}
	
	public EmpDTO toDTO(Employee emp)
	{
		EmpDTO dto = new EmpDTO();
		dto.setEmpId(emp.getEmpId());
		dto.setEmpName(emp.getEmpName());
		dto.setDesignation(emp.getDesignation());
		dto.setEmail(emp.getEmail());
		dto.setSalary(emp.getSalary());
		dto.setCity(emp.getAddress().getCity());
		dto.setHouseNo(emp.getAddress().getHouseNo());
		dto.setPincode(emp.getAddress().getPincode());
		return dto;
	}
	public Employee toEmp(EmpDTO dto)
	{
		Employee emp = new Employee();
		
		emp.setEmpName(dto.getEmpName());
		emp.setDesignation(dto.getDesignation());
		emp.setEmail(dto.getEmail());
		emp.setSalary(dto.getSalary());
		Address add = new Address(dto.getHouseNo(),dto.getCity(),dto.getPincode());
		emp.setAddress(add);
		return emp;
	}

}
