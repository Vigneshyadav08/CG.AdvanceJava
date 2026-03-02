package in.cg.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import in.cg.main.entities.User;
import in.cg.main.services.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService us;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User u1)
	{
		return us.addUser(u1);
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id)
	{
		return us.getUserDetails(id);
	}
	
	@GetMapping("/user")
	public List<User> getUsers()
	{
		return us.getAllUsers();
	}
	
	@PutMapping("/user/{id}")
	public User updateUSer(@PathVariable int id,@RequestBody User user)
	{
		return us.updateUser(id,user);
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUserById(@PathVariable int id)
	{
		return us.deleteUser(id);
	}
}
