package com.ust.demo.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.UserEntity;
import com.ust.demo.repository.userRepository;
@Service
public class customuser implements UserDetailsService {
@Autowired
private userRepository ur;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       UserEntity user= ur.findByUsername(username).orElseThrow();

       return new User(user.getUserName(),user.getPassword(),Collections.singleton(new SimpleGrantedAuthority(user.getRoles())));
    }

}
