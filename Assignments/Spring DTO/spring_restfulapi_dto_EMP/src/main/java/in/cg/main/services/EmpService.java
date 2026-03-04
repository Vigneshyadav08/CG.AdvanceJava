package in.cg.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.cg.main.dto.EmpDTO;

@Service
public interface EmpService {
	public EmpDTO addUser(EmpDTO emp);

	public List<EmpDTO> getAllEmp();

	public EmpDTO getEmpId(int id);

	public EmpDTO updateEmp(int id,EmpDTO dto);

	public EmpDTO deleteUser(int id);

}
