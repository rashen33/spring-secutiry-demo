package edu.srpingsec.controller;

import edu.srpingsec.dao.UserEntity;
import edu.srpingsec.dto.User;
import edu.srpingsec.repository.UserRepository;
import edu.srpingsec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/new-user")
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
            //Hashing the password
            String hashedPw = passwordEncoder.encode(user.getPassword());
            user.setPassword(hashedPw);
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

//    @RequestMapping("/user")
//    public UserEntity getUserDetailsAfterLogin(Authentication authentication) {
//        List<UserEntity> customers = userRepository.findByEmail(authentication.getName());
//        if (customers.size() > 0) {
//            return customers.get(0);
//        } else {
//            return null;
//        }
//
//    }

}
