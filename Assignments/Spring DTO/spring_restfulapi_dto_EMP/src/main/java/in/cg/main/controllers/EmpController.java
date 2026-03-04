package in.cg.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cg.main.dto.EmpDTO;
import in.cg.main.services.EmpService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmpController {
	@Autowired
	EmpService es;
	
	@PostMapping
	public EmpDTO addEmp(@Valid @RequestBody EmpDTO dto)
	{
		return es.addUser(dto);
	}
	
	@GetMapping
	public List<EmpDTO> getAll()
	{
		return es.getAllEmp();
	}
	
	@GetMapping("/{id}")
	public EmpDTO getEmpId(@PathVariable int id)
	{
		return es.getEmpId(id);
	}
	
	@PutMapping("/{id}")
	public EmpDTO updateEmp(@PathVariable int id,@RequestBody EmpDTO dto)
	{
		return es.updateEmp(id,dto);
	}
	
	@DeleteMapping("/{id}")
	public EmpDTO deleteUser(@PathVariable int id)
	{
		return es.deleteUser(id);
	}
}
