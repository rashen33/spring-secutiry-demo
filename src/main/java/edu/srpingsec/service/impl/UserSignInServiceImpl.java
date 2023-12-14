package edu.srpingsec.service.impl;


import edu.srpingsec.repository.UserRepository;
import edu.srpingsec.service.UserSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserSignInServiceImpl implements UserSignInService {
   @Autowired
   UserRepository userRepository;
}
