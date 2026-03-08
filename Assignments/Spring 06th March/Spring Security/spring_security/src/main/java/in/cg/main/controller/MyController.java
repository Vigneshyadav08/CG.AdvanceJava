package in.cg.main.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cg.main.dto.UserDTO;
import in.cg.main.services.UserService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MyController {

	private final UserService userService;

	public MyController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserDTO dto) {
		return userService.registerUser(dto);
	}
	
	@GetMapping("/user/profile")
	public String userProfile() {
		return "Welcome to profile page";
	}
	
	@GetMapping("/user/admin")
	public String adminDashboard() {
		return "Welcome to admin dashboard";
	}
	
	@DeleteMapping("/admin/delete/{id}")
	public String deleteUser(@PathVariable long id)
	{
		return userService.deleteUser(id); 
	}
}
