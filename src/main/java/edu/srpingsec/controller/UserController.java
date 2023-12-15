package edu.srpingsec.controller;

import edu.srpingsec.dao.UserEntity;
import edu.srpingsec.dto.User;
import edu.srpingsec.repository.UserRepository;
import edu.srpingsec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/log")
    public String loginMethod(){
        return "Login Success!";
    }

    @GetMapping("/register")
    public String singUpMethod(){
        return "Registration Success!";
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserEntity user) {
        UserEntity savedUser = null;
        ResponseEntity response = null;
        try {
            savedUser = userRepository.save(user);
            if (savedUser.getUserId() > 0) {
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        } catch (Exception ex) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + ex.getMessage());
        }
        return response;
    }

}
