package in.cg.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.cg.main.dto.UserDTO;

@Service
public interface UserService {
	public UserDTO createUser(UserDTO dto);
	public List<UserDTO> getAllUsers();
	public UserDTO getUserById(int id);
}
