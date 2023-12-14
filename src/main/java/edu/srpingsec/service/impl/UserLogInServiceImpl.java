package edu.srpingsec.service.impl;


import edu.srpingsec.repository.UserRepository;
import edu.srpingsec.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserLogInServiceImpl implements UserLoginService {
   @Autowired
   UserRepository userRepository;
}
