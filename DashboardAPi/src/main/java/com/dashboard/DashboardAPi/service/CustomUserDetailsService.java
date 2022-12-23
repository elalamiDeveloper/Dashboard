package com.dashboard.dashboardapi.service;

import com.dashboard.dashboardapi.Entity.User;
import com.dashboard.dashboardapi.Repository.UserRepository;
import com.dashboard.dashboardapi.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (username == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }

    public Object createEmployee(UserModel user) {
        User userEntity = new User();
        BeanUtils.copyProperties(user, userEntity);
        try{
            userRepository.save(userEntity);
            return user;
        }catch(Exception e){
            return "This User already exist";
        }
    }

}
