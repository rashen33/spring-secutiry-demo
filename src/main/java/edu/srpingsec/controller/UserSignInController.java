package edu.srpingsec.controller;

import edu.srpingsec.service.UserSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/sign-in")
public class UserSignInController {
    @Autowired
    UserSignInService userSignInService;


}
