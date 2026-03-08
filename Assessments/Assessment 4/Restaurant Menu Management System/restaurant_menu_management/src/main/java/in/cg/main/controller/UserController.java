package in.cg.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.cg.main.dto.UserDTO;
import in.cg.main.entities.User;
import in.cg.main.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody UserDTO dto){

        return userService.registerUser(dto);
    }
}