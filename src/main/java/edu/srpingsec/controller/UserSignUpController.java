package edu.srpingsec.controller;

import edu.srpingsec.service.UserSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/sign-up")
public class UserSignUpController {
    @Autowired
    UserSignUpService userSignInService;

    @GetMapping
    public String singupMethod(){
        return "Registration Success!";
    }
}
