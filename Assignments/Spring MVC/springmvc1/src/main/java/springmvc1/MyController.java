package springmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    
    @GetMapping("register")
    public String register()
    {
    		return "register";
    }
    
   /* @PostMapping("/register")
    public String registerUser(@RequestParam("username") String username,@RequestParam("password") String password,
    		@RequestParam("email") String email,Model m)
    {
    		m.addAttribute("username",username);
    		m.addAttribute("password", password);
    		m.addAttribute("email", email);
    		return "profile";
    }*/
    
    @PostMapping("profile")
    public String profile(@RequestParam("username") String username,@RequestParam("email") String email,
    						Model m)
    {
    		m.addAttribute("username",username);
    		m.addAttribute("email", email);
    		return "profile";
    }
}