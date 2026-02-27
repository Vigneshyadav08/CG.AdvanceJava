package spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.cg.beans.Employee;

@Controller
public class MyController {
	
    @GetMapping("/home")
    public String home(@ModelAttribute Employee emp) {
        return "home";
    }
    
    @GetMapping("register")
    public String register()
    {
    		return "register";
    }
    
    @PostMapping("submit")
    public String profile(@ModelAttribute Employee emp)
    {	
    		return "profile";
    }
    
}