package in.cg.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cg.main.dto.UserDTO;
import in.cg.main.services.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService us;
	
	@PostMapping
	public UserDTO createUser(@Valid @RequestBody UserDTO dto)
	{
		return us.createUser(dto);
	}
	
	@GetMapping
	public List<UserDTO> getAllUsers()
	{
		return us.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public UserDTO getUser(@PathVariable int id)
	{
		return us.getUserById(id);
	}
	
	@PutMapping("/{id}")
	public UserDTO updateUser(@PathVariable int id,@RequestBody UserDTO dto)
	{
		return us.updateUser(id,dto);
	}
}
