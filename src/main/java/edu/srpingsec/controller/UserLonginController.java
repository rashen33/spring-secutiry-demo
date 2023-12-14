package edu.srpingsec.controller;

import edu.srpingsec.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class UserLonginController {
    @Autowired
    UserLoginService userSignUpService;

    @GetMapping
    public String loginMethod(){
        return "Login Success!";
    }


}
