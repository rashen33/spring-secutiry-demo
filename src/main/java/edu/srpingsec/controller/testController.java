package edu.srpingsec.controller;

import edu.srpingsec.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test")
    public String testMethod(){
        return "Test Method";
    }
}
