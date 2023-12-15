package edu.srpingsec.config;

import edu.srpingsec.dao.UserEntity;
import edu.srpingsec.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetails implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        String userEmail = null;
        String password = null;
        List<GrantedAuthority> authorites = new ArrayList<>();;

        List<UserEntity> user = userRepository.findByEmail(email);
        if(user.size() == 0){
            throw new UsernameNotFoundException("User details not found for the user : " + email);
        }else {
            userEmail = user.get(0).getEmail();
            password = user.get(0).getPassword();
            authorites.add(new SimpleGrantedAuthority(user.get(0).getRole()));
        }
        return new User(userEmail,password,authorites);
    }
}
