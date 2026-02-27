package in.cg.containers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.cg.beans.Customer;

@Controller
public class HimsContainer {
	@GetMapping("login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("register")
	public String register()
	{
		return "register";
	}
	
	@GetMapping("policies")
	public String policies()
	{
		return "policies";
	}
	
	@GetMapping("profile")
	public String profile()
	{
		return "profile";
	}
	
	@PostMapping("submit")
	public String registerUser(@ModelAttribute Customer customer)
	{
		return "profile";
	}
	
}
