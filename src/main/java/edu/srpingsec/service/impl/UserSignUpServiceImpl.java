package edu.srpingsec.service.impl;


import edu.srpingsec.repository.UserRepository;
import edu.srpingsec.service.UserSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserSignUpServiceImpl implements UserSignUpService {
   @Autowired
   UserRepository userRepository;
}
