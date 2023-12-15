package edu.srpingsec.service;


import edu.srpingsec.repository.UserRepository;
import edu.srpingsec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
   @Autowired
   UserRepository userRepository;
}
