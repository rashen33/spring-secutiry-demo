package edu.srpingsec.controller;

import edu.srpingsec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/log")
    public String loginMethod(){
        return "Login Success!";
    }

    @GetMapping("/register")
    public String singUpMethod(){
        return "Registration Success!";
    }

}
